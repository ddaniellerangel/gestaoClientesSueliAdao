package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;

@Entity(name="cidade")
public class Cidade implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@Column(name="cidadecodigo")
	private Integer cidadeCodigo;
	@Column(name="cidadenome")
	private String cidadeNome;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="ufsigla")
	private Estado estado;
	
	@JsonBackReference
	@OneToMany(mappedBy="cidade", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Endereco> listEnderecos;
	
	public Cidade() {
		
	}

	public Cidade(Integer cidadeCodigo, String cidadeNome, Estado estado) {
		super();
		this.cidadeCodigo = cidadeCodigo;
		this.cidadeNome = cidadeNome;
		this.estado = estado;
	}

	public Integer getCidadeCodigo() {
		return cidadeCodigo;
	}

	public void setCidadeCodigo(Integer cidadeCodigo) {
		this.cidadeCodigo = cidadeCodigo;
	}

	public String getCidadeNome() {
		return cidadeNome;
	}

	public void setCidadeNome(String cidadeNome) {
		this.cidadeNome = cidadeNome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
