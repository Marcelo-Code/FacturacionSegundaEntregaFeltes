package com.segundaPreEntregaJava.segundaPreEntregaJava.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.segundaPreEntregaJava.segundaPreEntregaJava.DTO.CategoriaDTO;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Model.Categoria;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria getCategoria(Long id) {
        return categoriaRepository.findById(id).orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
    }

    public List<Categoria> getAllCategoria() {
        return categoriaRepository.findAll();
    }

    public void altaCategoria(Categoria categoria) {
        this.categoriaRepository.save(categoria);
    }

    public void bajaCategoria(Categoria categoria) {
        this.categoriaRepository.delete(categoria);
    }

    public List<Categoria> mostrarCategorias() {
        return this.categoriaRepository.mostrarCategorias();
    }

    public CategoriaDTO modificarCategoria(CategoriaDTO categoriaDTO) {
        Long id = categoriaDTO.getId();

        Optional<Categoria> categoria = categoriaRepository.findById(id);

        if (categoria.isPresent()) {
            Categoria categoriaActualizada = categoria.get();
            categoriaActualizada.setNombre(categoriaDTO.getNombre());
            categoriaActualizada.setDescripcion(categoriaDTO.getDescripcion());

            categoriaRepository.save(categoriaActualizada);

            return new CategoriaDTO(categoriaActualizada.getId(), categoriaActualizada.getNombre(),
                    categoriaActualizada.getDescripcion());
        }

        throw new RuntimeException("categoría no encontrada");
    }
}
