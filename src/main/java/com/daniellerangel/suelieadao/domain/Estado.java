package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;

@Entity(name="uf")
public class Estado implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull
	@Column(name="ufsigla")
	private String siglaEstado;
	@NotNull
	@Column(name="ufnome")
	private String nomeEstado;
	
	@JsonBackReference
	@OneToMany(mappedBy="estado", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Cidade> listCidades;
	
	public Estado() {
		
	}

	public List<Cidade> getListCidades() {
		return listCidades;
	}

	public void setListCidades(List<Cidade> listCidades) {
		this.listCidades = listCidades;
	}

	public Estado(String siglaEstado, String nomeEstado) {
		super();
		this.siglaEstado = siglaEstado;
		this.nomeEstado = nomeEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	
}
