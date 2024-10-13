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

import com.segundaPreEntregaJava.segundaPreEntregaJava.DTO.CategoriaDTO;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Model.Categoria;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Service.CategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    // GET: método para obtener todos las categorías

    @GetMapping("/getcategorias")
    public ResponseEntity<List<CategoriaDTO>> getCategorias() {
        try {
            List<Categoria> categorias = categoriaService.getAllCategoria();

            List<CategoriaDTO> categoriasDTO = categorias.stream().map(c -> {

                return new CategoriaDTO(c.getId(), c.getNombre(), c.getDescripcion());

            })
                    .collect(Collectors.toList());
            return ResponseEntity.ok(categoriasDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // POST: método para dar de alta una categoría

    @PostMapping("/createcategoria")
    public ResponseEntity<?> altaCategoria(@RequestBody Categoria categoria) {
        try {
            this.categoriaService.altaCategoria(categoria);
            return ResponseEntity.ok(categoria);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // DELETE: método para dar de baja una categoría

    @DeleteMapping("/deletecategoria/{id}")
    public ResponseEntity<?> bajaCategoria(@PathVariable Long id) {
        try {
            Categoria categoriaABorrar = categoriaService.getCategoria(id);
            this.categoriaService.bajaCategoria(categoriaABorrar);
            return ResponseEntity.ok("categoria borrada");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("categoría no encontrada, id no corresponde");
        }
    }

    // PUT: método para modificar una categoría

    @PutMapping("/modifycategoria")
    public ResponseEntity<?> modificarCategoria(@RequestBody CategoriaDTO categoriaDTO) {
        try {
            CategoriaDTO categoriaModificada = categoriaService.modificarCategoria(categoriaDTO);
            return ResponseEntity.ok(categoriaModificada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("categoría no encontrada, id no corresponde");
        }
    }
}
