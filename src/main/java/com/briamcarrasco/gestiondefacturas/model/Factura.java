package com.briamcarrasco.gestiondefacturas.model;

import java.util.List;

public class Factura {
    private int idFactura;
    private int numeroFactura;
    private String fechaEmision;
    private Emisor emisor;
    private List<DetalleFactura> detalles; 
    private Cliente cliente;
    private double total; 
    

    // Constructor
    public Factura(int idFactura, int numeroFactura, String fechaEmision, Emisor emisor, List<DetalleFactura> detalles, Cliente cliente, double total) {
        this.idFactura = idFactura;
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.emisor = emisor;
        this.detalles = detalles;
        this.cliente = cliente;
        this.total = total;
    }

    // Getters
    public int getIdFactura() {
        return idFactura;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Emisor getEmisor() {
        return emisor;
    }

    public List<DetalleFactura> getDetalles() {
        return detalles;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }



}
