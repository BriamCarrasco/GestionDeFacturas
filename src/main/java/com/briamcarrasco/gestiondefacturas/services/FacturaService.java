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

        // Crear 8 facturas asignando clientes y detalles de forma aleatoria
        for (int i = 1; i <= 8; i++) {
            int numeroFactura = 1000 + i; // Simulación de número de factura
            String fechaEmision = "2025-03-30"; // Puedes cambiarlo a una fecha dinámica
            Cliente cliente = clientes.get(random.nextInt(clientes.size()));

            // Dividir los detalles en subconjuntos para cada factura
            List<DetalleFactura> detallesFactura = detalles.subList(0, random.nextInt(detalles.size()) + 1);

            facturas.add(new Factura(i, numeroFactura, fechaEmision, emisor, detallesFactura, cliente, 32332));
        }
    }

    public List<Factura> obtenerFacturas() {
        return facturas;
    }

    public Optional<Factura> obtenerFacturaPorId(int id) {
        return facturas.stream()
                       .filter(facturas -> facturas.getIdFactura() == id)
                       .findFirst();
    }
}