package com.briamcarrasco.gestiondefacturas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.briamcarrasco.gestiondefacturas.model.DetalleFactura;
import com.briamcarrasco.gestiondefacturas.model.Servicios;

@Service
public class DetalleFacturaService {
    private final List<DetalleFactura> detallesFactura = new ArrayList<>();

    public DetalleFacturaService(ServiciosService serviciosService) {
        agregarDetalleFactura(1, serviciosService.obtenerServicioPorId(1), 1);
        agregarDetalleFactura(2, serviciosService.obtenerServicioPorId(2), 2);
        agregarDetalleFactura(3, serviciosService.obtenerServicioPorId(3), 1);
        agregarDetalleFactura(4, serviciosService.obtenerServicioPorId(4), 1);
        agregarDetalleFactura(5, serviciosService.obtenerServicioPorId(5), 2);
        agregarDetalleFactura(6, serviciosService.obtenerServicioPorId(6), 1);
        agregarDetalleFactura(7, serviciosService.obtenerServicioPorId(7), 3);
        agregarDetalleFactura(8, serviciosService.obtenerServicioPorId(8), 2);
    }//inicializa la lista de detalles de factura con algunos datos de ejemplo

      private void agregarDetalleFactura(int id, Optional<Servicios> servicioOpt, int cantidad) {
        servicioOpt.ifPresent(servicio -> {
            detallesFactura.add(new DetalleFactura(id, servicio, cantidad, servicio.getPrecioServicio(), cantidad));
        });
    }//agrega un detalle de factura a la lista de detalles de factura

    public List<DetalleFactura> obtenerDetallesFactura() {
        return detallesFactura;
    }//devuelve la lista de detalles de factura
}
