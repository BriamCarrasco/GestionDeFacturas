package com.briamcarrasco.gestiondefacturas.services;

import org.springframework.stereotype.Service;

import com.briamcarrasco.gestiondefacturas.model.Emisor;

@Service
public class EmisorService {
    private final Emisor emisor;

    public EmisorService() {

        this.emisor = new Emisor(1, "Veterinaria Rescatando Huellas", "76.123.456-7", "San Gregorio #1312, Nacimiento, Chile");
    }//inicializa el emisor con datos de ejemplo

    public Emisor obtenerEmisor() {
        return emisor;
    }//devuelve el emisor

}
