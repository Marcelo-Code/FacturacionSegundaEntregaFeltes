package com.segundaPreEntregaJava.segundaPreEntregaJava.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.segundaPreEntregaJava.segundaPreEntregaJava.Model.Auto;

@Repository
public interface AutosRepository extends JpaRepository<Auto, Integer> {

    @Query("SELECT a FROM Auto a WHERE a.marca = :marca")
    List<Auto> buscarPorMarca(@Param("marca") String marca);

    @Query("SELECT a FROM Auto a JOIN a.categoria c")
    List<Auto> mostrarAutos();

    @Query("SELECT a from Auto a WHERE a.anio > :anio")
    List<Auto> buscarAnioMayor(@Param("anio") int anio);

    @Query("SELECT a from Auto a WHERE a.anio < :anio")
    List<Auto> buscarAnioMenor(@Param("anio") int anio);

    @Modifying
    @Query("DELETE FROM Auto a WHERE a.id = :id")
    void eliminarAutoPorId(@Param("id") int id);

    Optional<Auto> findById(int id);

}