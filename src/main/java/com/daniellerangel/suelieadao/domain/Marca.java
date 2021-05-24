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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;

@Entity(name="marca")
public class Marca implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name="marcacodigo")
	private Integer marcaCodigo;
	@NotNull
	@Column(name="marcanome")
	private String marcaNome;
	
	@JsonBackReference
	@OneToMany(mappedBy="marca", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Produto> listProdutos;
	
	public List<Produto> getListProdutos() {
		return listProdutos;
	}

	public void setListProdutos(List<Produto> listProdutos) {
		this.listProdutos = listProdutos;
	}
	
	public Marca() {
		
	}

	public Marca(Integer marcaCodigo, String marcaNome) {
		super();
		this.marcaCodigo = marcaCodigo;
		this.marcaNome = marcaNome;
	}

	public Integer getMarcaCodigo() {
		return marcaCodigo;
	}

	public void setMarcaCodigo(Integer marcaCodigo) {
		this.marcaCodigo = marcaCodigo;
	}

	public String getMarcaNome() {
		return marcaNome;
	}

	public void setMarcaNome(String marcaNome) {
		this.marcaNome = marcaNome;
	}
	
	
}
