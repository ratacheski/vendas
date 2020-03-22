package com.ratacheski.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class VendasConfiguration {
    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Development Rodando");
        };
    }
}
