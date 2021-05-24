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
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;

@Entity(name="categoria")
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name="categoriacodigo")
	private Integer categoriaCodigo;
	@NotNull
	@Column(name="categorianome")
	private String categoriaNome;
	
	@JsonManagedReference
	@OneToMany(mappedBy="categoriaProdutoPK.categoria", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<CategoriaProduto> listCategoriasProdutos;
	
	public Categoria() {
		
	}

	public Categoria(Integer categoriaCodigo, String categoriaNome) {
		super();
		this.categoriaCodigo = categoriaCodigo;
		this.categoriaNome = categoriaNome;
	}

	public Integer getCategoriaCodigo() {
		return categoriaCodigo;
	}

	public void setCategoriaCodigo(Integer categoriaCodigo) {
		this.categoriaCodigo = categoriaCodigo;
	}

	public String getCategoriaNome() {
		return categoriaNome;
	}

	public void setCategoriaNome(String categoriaNome) {
		this.categoriaNome = categoriaNome;
	}

	public List<CategoriaProduto> getListCategoriasProdutos() {
		return listCategoriasProdutos;
	}

	public void setListCategoriasProdutos(List<CategoriaProduto> listCategoriasProdutos) {
		this.listCategoriasProdutos = listCategoriasProdutos;
	}
	
	
}
