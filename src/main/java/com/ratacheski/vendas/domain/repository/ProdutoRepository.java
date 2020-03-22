package com.ratacheski.vendas.domain.repository;

import com.ratacheski.vendas.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
