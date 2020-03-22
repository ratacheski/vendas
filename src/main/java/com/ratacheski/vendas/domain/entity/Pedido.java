package com.ratacheski.vendas.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private LocalDate dataPedido;

    @Column(precision = 20, scale = 2)
    private BigDecimal total;

    @OneToMany(mappedBy = "pedido")
    @ToString.Exclude
    private Set<ItemPedido> itensPedido;
}
