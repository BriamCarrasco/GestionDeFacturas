package com.briamcarrasco.gestiondefacturas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.briamcarrasco.gestiondefacturas.model.Cliente;
import com.briamcarrasco.gestiondefacturas.model.DetalleFactura;
import com.briamcarrasco.gestiondefacturas.model.Emisor;
import com.briamcarrasco.gestiondefacturas.model.Factura;

@Service
public class FacturaService {
    private final List<Factura> facturas = new ArrayList<>();

    public FacturaService(EmisorService emisorService, ClienteService clienteService, DetalleFacturaService detalleFacturaService) {
        Emisor emisor = emisorService.obtenerEmisor();
        List<Cliente> clientes = clienteService.obtenerClientes();
        List<DetalleFactura> detalles = detalleFacturaService.obtenerDetallesFactura();

        Random random = new Random();

        //crea facturas con datos de ejemplo de forma aleatoria con datos de clientes, emisor y detalles de factura.
        for (int i = 1; i <= 8; i++) {
            int numeroFactura = 1000 + i;
            String fechaEmision = "2025-03-30"; //se propone una fecha de emision fija para el ejemplo.
            Cliente cliente = clientes.get(random.nextInt(clientes.size())); //se elige un cliente aleatorio de la lista de clientes.

            List<DetalleFactura> detallesFactura = detalles.subList(0, random.nextInt(detalles.size()) + 1); 

            facturas.add(new Factura(i, numeroFactura, fechaEmision, emisor, detallesFactura, cliente, 32332));//se crea una nueva factura con los datos de ejemplo.
        }
    }

    public List<Factura> obtenerFacturas() {
        return facturas;
    }//devuelve la lista de facturas

    public Optional<Factura> obtenerFacturaPorId(int id) {
        return facturas.stream()
                       .filter(facturas -> facturas.getIdFactura() == id)
                       .findFirst();
    }//devuelve una factura por su id.
}