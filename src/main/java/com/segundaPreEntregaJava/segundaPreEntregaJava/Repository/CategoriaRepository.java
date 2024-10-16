package com.segundaPreEntregaJava.segundaPreEntregaJava.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.segundaPreEntregaJava.segundaPreEntregaJava.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    @Query("SELECT c FROM Categoria c")
    List<Categoria> mostrarCategorias();

    Optional<Categoria> findById(Long id);
}