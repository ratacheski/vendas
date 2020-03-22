package com.ratacheski.vendas.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", length = 100)
    private String nome;

    @OneToMany(mappedBy = "cliente")
    @ToString.Exclude
    private Set<Pedido> pedidos;

    public Cliente(String nome) {
        this.nome = nome;
    }

}
