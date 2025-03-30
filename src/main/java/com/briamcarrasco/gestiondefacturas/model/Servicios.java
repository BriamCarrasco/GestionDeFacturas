package com.briamcarrasco.gestiondefacturas.model;

public class Servicios {
    private int idServicio;
    private String nombreServicio;
    private String descripcionServicio;
    private double precioServicio;

    // Constructor de Servicios
    public Servicios(int idServicio, String nombreServicio, String descripcionServicio, double precioServicio) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.descripcionServicio = descripcionServicio;
        this.precioServicio = precioServicio;
    }

    // Getters

    public int getIdServicio() {
        return idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public double getPrecioServicio() {
        return precioServicio;
    }

    
}


