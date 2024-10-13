package com.segundaPreEntregaJava.segundaPreEntregaJava.DTO;

import java.io.Serializable;

public class AutoDTO implements Serializable {
    private int id;
    private String marca;
    private String modelo;
    private int anio;
    private Double precio;
    private String categoriaNombre;
    private Long categoriaId;

    public AutoDTO(int id, String marca, String modelo, int anio, Double precio, String categoriaNombre,
            Long categoriaId) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.categoriaNombre = categoriaNombre;
        this.categoriaId = categoriaId;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoriaNombre) {
        this.categoriaNombre = categoriaNombre;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoriaNombre;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

}
