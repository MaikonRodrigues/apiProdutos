package com.example.lojade.controller;

import com.example.lojade.controller.dto.ProdutoDto;
import com.example.lojade.interf.ProdutoRepository;
import com.example.lojade.modelo.Categoria;
import com.example.lojade.modelo.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public void cadastrar(ProdutoDto produtos){
        repository.save(new Produto(produtos));
    }
    public List<ProdutoDto> lista(){
        Produto produto = new Produto("Camisola",  new Categoria( "Roupa de dormir"), 10.25, 3,"" );
        ProdutoDto prodRetorno = new ProdutoDto(produto);

        return ProdutoDto.converter(Arrays.asList(produto,produto,produto));
    }
}
