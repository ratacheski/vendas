package com.ratacheski.vendas.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private LocalDate dataPedido;

    @Column(length = 20, precision = 2)
    private BigDecimal total;

    @OneToMany(mappedBy = "pedido")
    private Set<ItemPedido> itensPedido;
}
