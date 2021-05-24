package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Embeddable
public class CategoriaProdutoPK implements Serializable{
	private static final long serialVersionUID = 1L;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="categoriacodigo")
	private Categoria categoria;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="produtocodigo")
	private Produto produto;
	
	public CategoriaProdutoPK() {
		
	}

	public CategoriaProdutoPK(Categoria categoria, Produto produto) {
		super();
		this.categoria = categoria;
		this.produto = produto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
