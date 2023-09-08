package com.example.lojade.modelo;

import com.example.lojade.controller.dto.ProdutoDto;
import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDateTime;
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToOne
	private Categoria categoria;
	@Enumerated(EnumType.STRING)
	private StatusProduto status = StatusProduto.INDISPONIVEL;
	private double valor;
	private int qtdEstoque;
	private String imagem;

	public Produto(String nome, Categoria categoria, double valor, int qtdEstoque, String imagem) {
		this.nome = nome;
		this.categoria = categoria;
		this.valor = valor;
		this.qtdEstoque = qtdEstoque;
		this.imagem = imagem;
	}

	public Produto(ProdutoDto produtos) {
		this.nome = produtos.getNome();
		this.categoria = produtos.getCategoria();
		this.qtdEstoque = produtos.getQtdEstoque();
		this.valor = produtos.getValor();
		this.imagem = produtos.getImagem();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
