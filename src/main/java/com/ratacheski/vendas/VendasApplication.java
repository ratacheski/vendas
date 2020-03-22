package com.ratacheski.vendas;

import com.ratacheski.vendas.domain.entity.Cliente;
import com.ratacheski.vendas.domain.entity.Pedido;
import com.ratacheski.vendas.domain.repository.ClienteRepository;
import com.ratacheski.vendas.domain.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner runner(@Autowired ClienteRepository clienteRepository,
                                    @Autowired PedidoRepository pedidoRepository) {
        return args -> {
            System.out.println("Salvando Clientes");
            Cliente rafael = clienteRepository.save(new Cliente("Rafael"));
            Pedido p = new Pedido();
            p.setCliente(rafael);
            p.setDataPedido(LocalDate.now());
            p.setTotal(BigDecimal.TEN);
            pedidoRepository.save(p);
            Cliente clienteComPedidos = clienteRepository.findClienteComPedidos(rafael.getId());
            System.out.println(clienteComPedidos);
            pedidoRepository.findByCliente_IdOrderByDataPedidoDesc(rafael.getId()).forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

}
