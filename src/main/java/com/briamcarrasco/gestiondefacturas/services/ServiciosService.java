package com.briamcarrasco.gestiondefacturas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.briamcarrasco.gestiondefacturas.model.Servicios;

@Service
public class ServiciosService {
    private final List<Servicios> servicios = new ArrayList<>();

    public ServiciosService(){
        servicios.add(new Servicios(1,"Cirugia","Servicio de cirugia", 35000));
        servicios.add(new Servicios(2,"Consulta","Servicio de consulta", 15000));
        servicios.add(new Servicios(3,"Radiografia","Servicio de radiografia", 20000));
    }//se inicializa la lista de servicios con datos de ejemplo.

    public List<Servicios> obtenerServicios() {
        return servicios;
    } //retorna la lista de servicios

    public Optional<Servicios> obtenerServicioPorId(int id) {
        return servicios.stream().filter(s -> s.getIdServicio() == id).findFirst();
    }//retorna un servicio por id


}
