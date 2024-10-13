package com.segundaPreEntregaJava.segundaPreEntregaJava.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AUTOS")

public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "MODELO")
    private String modelo;

    @Column(name = "ANIO")
    private int anio;

    @Column(name = "PRECIO")
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "CATEGORIA_ID", nullable = false)
    private Categoria categoria;

    // Constructor por defecto
    public Auto() {
    }

    public Auto(String marca, String modelo, int anio, Double precio, Categoria categoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Métodos Getters

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

    public Categoria getCategoria() {
        return categoria;
    }

    public String getCategoriaNombre() {
        return categoria.getNombre();
    }

    public Long getCategoriaId() {
        return categoria.getId();
    }

    // Métodos Setters

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

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Auto [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio
                + ", categoria=" + categoria + "]";
    }

}
