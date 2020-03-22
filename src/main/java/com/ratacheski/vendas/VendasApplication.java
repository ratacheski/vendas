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
            System.out.println("Salvando Clientes");
            System.out.println(repository.save(new Cliente("Rafael")));
            System.out.println(repository.save(new Cliente("João")));
            System.out.println("Listando Todos Clientes");
            repository.findAll().forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

}
