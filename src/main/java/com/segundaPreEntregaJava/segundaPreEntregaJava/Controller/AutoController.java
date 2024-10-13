package com.segundaPreEntregaJava.segundaPreEntregaJava.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.segundaPreEntregaJava.segundaPreEntregaJava.DTO.AutoDTO;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Model.Auto;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Service.AutoService;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Service.CategoriaService;

@Controller
@RequestMapping("/autos")
public class AutoController {

    @Autowired
    AutoService autoService;

    @Autowired
    CategoriaService categoriaService;

    // GET: método para obtener todos los autos

    @GetMapping("/getautos")
    public ResponseEntity<List<AutoDTO>> getAll() {
        try {
            List<Auto> autos = autoService.getAllAutos();

            List<AutoDTO> autosDTO = autos.stream().map(a -> {

                return new AutoDTO(a.getId(), a.getMarca(), a.getModelo(), a.getAnio(), a.getPrecio(),
                        a.getCategoriaNombre(), a.getCategoriaId());

            }).collect(Collectors.toList());
            return ResponseEntity.ok(autosDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // POST: método para dar de alta un auto

    @PostMapping("/createauto")

    public ResponseEntity<AutoDTO> altaAuto(@RequestBody AutoDTO autoDTO) {
        try {
            return ResponseEntity.ok().body(this.autoService.altaAuto(autoDTO));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // DELETE: método para dar de baja un auto

    @DeleteMapping("/deleteauto/{id}")

    public ResponseEntity<?> bajaAuto(@PathVariable int id) {
        try {
            Auto autoABorrar = autoService.getAutoById(id);
            this.autoService.bajaAuto(autoABorrar);
            return ResponseEntity.ok("auto borrado");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("auto no encontrado, id no corresponde");
        }
    }

    // PUT: método para modificar un auto

    @PutMapping("/modifyauto")

    public ResponseEntity<?> modificarAuto(@RequestBody AutoDTO autoDTO) {
        try {
            AutoDTO autoModificado = autoService.modificarAuto(autoDTO);
            return ResponseEntity.ok().body(autoModificado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("auto no encontrado, id no corresponde");
        }
    }

}
