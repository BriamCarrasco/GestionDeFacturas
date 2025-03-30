package com.briamcarrasco.gestiondefacturas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briamcarrasco.gestiondefacturas.model.Factura;
import com.briamcarrasco.gestiondefacturas.services.FacturaService;



@RestController
@RequestMapping("/facturas")
public class FacturaController {
    private final FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @GetMapping
    public List<Factura> obtenerFacturas() {
        return facturaService.obtenerFacturas();
    }

    @GetMapping("/{id}")
    public Optional<Factura> obtenerFacturaPorId(@PathVariable int id) {
        return facturaService.obtenerFacturaPorId(id);
    }
    
    
}