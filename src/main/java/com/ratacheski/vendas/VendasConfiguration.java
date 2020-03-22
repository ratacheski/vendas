package com.ratacheski.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class VendasConfiguration {
    @Bean
    public CommandLineRunner executar() {
        return args -> System.out.println("Development Rodando");
    }
}
