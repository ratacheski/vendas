package com.ratacheski.vendas.domain.repository;

import com.ratacheski.vendas.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("select c from Cliente c left join fetch c.pedidos p where c.id = :id")
    Cliente findClienteComPedidos(@Param("id") Integer idCliente);
}
