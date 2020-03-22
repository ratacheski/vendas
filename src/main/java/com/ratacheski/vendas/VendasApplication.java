package com.ratacheski.vendas;

import com.ratacheski.vendas.domain.entity.Cliente;
import com.ratacheski.vendas.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner runner(@Autowired ClienteRepository repository) {
        return args -> {
            Cliente cliente = new Cliente("Fulano");
            repository.save(cliente);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

}
