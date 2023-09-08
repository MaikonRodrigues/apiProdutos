package com.example.lojade.controller.dto;

import com.example.lojade.modelo.Categoria;
import com.example.lojade.modelo.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoDto {
    private Long id;
    private String nome;
    private Categoria categoria;
    private double valor;
    private int qtdEstoque;
    private String imagem;

    public ProdutoDto(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.categoria = produto.getCategoria();
        this.valor = produto.getValor();
        this.qtdEstoque = produto.getQtdEstoque();
        this.imagem = produto.getImagem();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public static List<ProdutoDto> converter(List<Produto> produtos){
        return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
    }
}
