package com.segundaPreEntregaJava.segundaPreEntregaJava.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.segundaPreEntregaJava.segundaPreEntregaJava.DTO.AutoDTO;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Model.Auto;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Model.Categoria;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Repository.AutosRepository;

import jakarta.transaction.Transactional;

@Service
public class AutoService {

    @Autowired
    private AutosRepository autosRepository;

    @Autowired
    private CategoriaService categoriaService;

    public Auto getAutoById(int id) {
        return autosRepository.findById(id).orElseThrow(() -> new RuntimeException("auto no encontrado"));
    }

    public List<Auto> getAllAutos() {
        return autosRepository.findAll();
    }

    public List<Auto> buscarPorMarca(String nombre) {
        return this.autosRepository.buscarPorMarca(nombre);
    }

    public List<Auto> mostrarAutos() {
        return this.autosRepository.mostrarAutos();
    }

    public List<Auto> buscarAnioMayor(int anio) {
        return this.autosRepository.buscarAnioMayor(anio);
    }

    public List<Auto> buscarAnioMenor(int anio) {
        return this.autosRepository.buscarAnioMenor(anio);
    }

    public void altaAuto(Auto auto) {
        this.autosRepository.save(auto);
    }

    public void bajaAuto(Auto auto) {
        this.autosRepository.delete(auto);
    }

    public AutoDTO altaAuto(AutoDTO autoDTO) {
        Categoria categoria = categoriaService.getCategoria(autoDTO.getCategoriaId());
        Auto nuevoAuto = new Auto();
        nuevoAuto.setMarca(autoDTO.getMarca());
        nuevoAuto.setModelo(autoDTO.getModelo());
        nuevoAuto.setAnio(autoDTO.getAnio());
        nuevoAuto.setPrecio(autoDTO.getPrecio());
        nuevoAuto.setCategoria(categoria);

        this.autosRepository.save(nuevoAuto);

        AutoDTO nuevoAutoDTO = new AutoDTO(nuevoAuto.getId(), nuevoAuto.getMarca(), nuevoAuto.getModelo(),
                nuevoAuto.getAnio(), nuevoAuto.getPrecio(), nuevoAuto.getCategoriaNombre(), nuevoAuto.getCategoriaId());

        return nuevoAutoDTO;
    }

    public String bajaAuto(AutoDTO autoDTO) {
        Optional<Auto> autoOptional = autosRepository.findById(autoDTO.getId());
        if (autoOptional.isPresent()) {
            Auto autoEliminar = autoOptional.get();
            this.autosRepository.delete(autoEliminar);
            return "auto borrado";
        }
        throw new RuntimeException("auto no encontrado");
    }

    public AutoDTO modificarAuto(AutoDTO autoDTO) {
        int id = autoDTO.getId();

        Optional<Auto> auto = autosRepository.findById(id);

        if (auto.isPresent()) {
            Auto autoActualizado = auto.get();
            autoActualizado.setMarca(autoDTO.getMarca());
            autoActualizado.setModelo(autoDTO.getModelo());
            autoActualizado.setAnio(autoDTO.getAnio());
            autoActualizado.setPrecio(autoDTO.getPrecio());
            autoActualizado.setCategoria(categoriaService.getCategoria(autoDTO.getCategoriaId()));

            autosRepository.save(autoActualizado);
            return new AutoDTO(autoActualizado.getId(),
                    autoActualizado.getMarca(),
                    autoActualizado.getModelo(),
                    autoActualizado.getAnio(),
                    autoActualizado.getPrecio(),
                    autoActualizado.getCategoriaNombre(),
                    autoActualizado.getCategoriaId());
        }

        throw new RuntimeException("auto no encontrado");
    }

    @Transactional
    public void eliminarAutoPorId(int id) {
        this.autosRepository.eliminarAutoPorId(id);
    }

}
