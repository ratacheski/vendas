package com.ratacheski.vendas.domain.repository;

import com.ratacheski.vendas.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByCliente_IdOrderByDataPedidoDesc(Integer clienteId);
}
