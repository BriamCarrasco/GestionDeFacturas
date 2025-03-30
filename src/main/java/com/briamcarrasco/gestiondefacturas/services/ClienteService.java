package com.briamcarrasco.gestiondefacturas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.briamcarrasco.gestiondefacturas.model.Cliente;

@Service
public class ClienteService {
    private final List<Cliente> clientes = new ArrayList<>();

    public ClienteService() {
        clientes.add(new Cliente(1, "Juan Perez", "12345678-9", "San Martin #740", "987654321"));
        clientes.add(new Cliente(2, "Miguel Bravo", "17996865-5", "Prieto #914", "987654321"));
        clientes.add(new Cliente(3, "Elizabeth Toledo", "20384744-9", "Prieto #740", "987654321"));
        clientes.add(new Cliente(4, "Sofía Ramírez", "18273645-K", "Avenida Los Andes #123", "987123456"));
        clientes.add(new Cliente(5, "Andrés Vargas", "19384756-2", "Calle Las Flores #456", "987654321"));
        clientes.add(new Cliente(6, "Valentina Castro", "20495867-3", "Pasaje El Sol #789", "987987654"));
        clientes.add(new Cliente(7, "Javier Fuentes", "21506978-4", "Camino La Luna #101", "987321654"));
        clientes.add(new Cliente(8, "Isidora Díaz", "22617089-5", "Ruta El Bosque #112", "987654123"));
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public Optional<Cliente> obtenerClientePorId(int id) {
        return clientes.stream()
                       .filter(cliente -> cliente.getIdCliente() == id)
                       .findFirst();
    }
}
