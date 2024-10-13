package com.segundaPreEntregaJava.segundaPreEntregaJava.DTO;

import java.io.IOException;
import java.io.OutputStream;

import org.springframework.core.serializer.Serializer;

@SuppressWarnings("rawtypes")
public class CategoriaDTO implements Serializer {
    private Long id;
    private String nombre;
    private String descripcion;

    public CategoriaDTO(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void serialize(Object object, OutputStream outputStream) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method 'serialize'");
    }

}