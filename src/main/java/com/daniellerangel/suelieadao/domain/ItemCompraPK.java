package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Embeddable
public class ItemCompraPK implements Serializable{
	private static final long serialVersionUID = 1L;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="compracodigo")
	private Compra compra;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="produtocodigo")
	private Produto produto;
	
	public ItemCompraPK() {
		
	}

	public ItemCompraPK(Compra compra, Produto produto) {
		super();
		this.compra = compra;
		this.produto = produto;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
