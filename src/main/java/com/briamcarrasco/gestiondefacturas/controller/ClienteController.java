package com.briamcarrasco.gestiondefacturas.controller;
import org.springframework.web.bind.annotation.RestController;
import com.briamcarrasco.gestiondefacturas.model.Cliente;
import com.briamcarrasco.gestiondefacturas.services.ClienteService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.obtenerClientes();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> obtenerClientePorId(@PathVariable int id) {
        return clienteService.obtenerClientePorId(id);
    }
}
