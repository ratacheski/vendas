package com.ratacheski.vendas.rest.controller;

import com.ratacheski.vendas.domain.entity.Cliente;
import com.ratacheski.vendas.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
