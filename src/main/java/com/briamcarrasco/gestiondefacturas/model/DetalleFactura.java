package com.briamcarrasco.gestiondefacturas.model;

public class DetalleFactura {
    
    // Atributos
    private int idDetalleFactura;
    private Servicios servicio;
    private int cantidad; 
    private double precioUnitario;
    private double subtotal;

    // Constructor
    public DetalleFactura(int idDetalleFactura, Servicios servicio, int cantidad, double precioUnitario, double subtotal) {
        this.idDetalleFactura = idDetalleFactura;
        this.servicio = servicio;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal; 
    }


    // Getters

    public int getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public Servicios getServicio() {
        return servicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }




}
