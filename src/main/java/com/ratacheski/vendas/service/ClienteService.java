package com.ratacheski.vendas.service;

import com.ratacheski.vendas.model.Cliente;
import com.ratacheski.vendas.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void SalvarCliente(Cliente cliente){
        validarCliente(cliente);
        clienteRepository.persist(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
