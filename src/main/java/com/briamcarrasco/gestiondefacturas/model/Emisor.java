package com.briamcarrasco.gestiondefacturas.model;

public class Emisor {
    private int idEmisor;
    private String nombreEmisor;
    private String rutEmisor;
    private String direccionEmisor;


    // Constructor
    public Emisor(int idEmisor, String nombreEmisor, String rutEmisor, String direccionEmisor) {
        this.idEmisor = idEmisor;
        this.nombreEmisor = nombreEmisor;
        this.rutEmisor = rutEmisor;
        this.direccionEmisor = direccionEmisor;
    }

    // Getters

    public int getIdEmisor() {
        return idEmisor;
    }
    
    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public String getRutEmisor() {
        return rutEmisor;
    }

    public String getDireccionEmisor() {
        return direccionEmisor;
    }

    

}
