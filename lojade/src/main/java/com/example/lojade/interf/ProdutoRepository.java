package com.example.lojade.interf;

import com.example.lojade.modelo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
}