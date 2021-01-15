package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name="uf")
public class Estado implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull
	@Column(name="ufcodigo")
	private Integer codEstado;
	
	@NotNull
	@Column(name="ufsigla")
	private String siglaEstado;
	
	@NotNull
	@Column(name="ufnome")
	private String nomeEstado;
	
	public Estado() {
		
	}

	public Estado(Integer codEstado, String siglaEstado, String nomeEstado) {
		super();
		this.codEstado = codEstado;
		this.siglaEstado = siglaEstado;
		this.nomeEstado = nomeEstado;
	}

	public Integer getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Integer codEstado) {
		this.codEstado = codEstado;
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
