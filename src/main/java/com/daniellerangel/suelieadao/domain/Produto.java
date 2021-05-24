package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;

@Entity(name="produto")
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name="produtocodigo")
	private Integer produtoCodigo;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="marcacodigo")
	private Marca marca;
	
	@Column(name="produtonome")
	private String produtoNome;
	
	@Column(name="produtoqtdestoque")
	private Integer produtoQtdEstoque;
	
	@JsonManagedReference
	@OneToMany(mappedBy="categoriaProdutoPK.produto", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<CategoriaProduto> listCategoriasProdutos;
	
	@JsonBackReference
	@OneToMany(mappedBy="itemCompraPK.produto", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<ItemCompra> listItensCompra;
	
	public Produto() {
		
	}

	public Produto(Integer produtoCodigo, Marca marca, String produtoNome, Integer produtoQtdEstoque) {
		super();
		this.produtoCodigo = produtoCodigo;
		this.marca = marca;
		this.produtoNome = produtoNome;
		this.produtoQtdEstoque = produtoQtdEstoque;
	}

	public Integer getProdutoCodigo() {
		return produtoCodigo;
	}

	public void setProdutoCodigo(Integer produtoCodigo) {
		this.produtoCodigo = produtoCodigo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getProdutoNome() {
		return produtoNome;
	}

	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}

	public Integer getProdutoQtdEstoque() {
		return produtoQtdEstoque;
	}

	public void setProdutoQtdEstoque(Integer produtoQtdEstoque) {
		this.produtoQtdEstoque = produtoQtdEstoque;
	}

	public List<CategoriaProduto> getListCategoriasProdutos() {
		return listCategoriasProdutos;
	}

	public void setListCategoriasProdutos(List<CategoriaProduto> listCategoriasProdutos) {
		this.listCategoriasProdutos = listCategoriasProdutos;
	}

	public List<ItemCompra> getListItensCompra() {
		return listItensCompra;
	}

	public void setListItensCompra(List<ItemCompra> listItensCompra) {
		this.listItensCompra = listItensCompra;
	}
}
