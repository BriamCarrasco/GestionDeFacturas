package com.briamcarrasco.gestiondefacturas.model;


public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String rutCliente;
    private String direccionCliente;
    private String telefonoCliente;

    // Constructor
    public Cliente(int idCliente, String nombreCliente, String rutCliente, String direccionCliente, String telefonoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.rutCliente = rutCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
    }

    
    // Getters
    public int getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }


}



