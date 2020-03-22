package com.ratacheski.vendas.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String descricao;

    @Column(precision = 20, scale = 2)
    private BigDecimal precoUnitario;
}
