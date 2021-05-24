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

@Entity(name="endereco")
public class Endereco implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name="enderecocodigo")
	private Integer enderecoCodigo;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="clientecodigo")
	private Cliente cliente;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="cidadecodigo")
	private Cidade cidade;
	
	@Column(name="enderecorua")
	private String enderecoRua;
	
	@Column(name="enderecobairro")
	private String enderecoBairro;
	
	@Column(name="endereconumero")
	private Integer enderecoNumero;
	
	public Endereco() {
		
	}

	public Endereco(Integer enderecoCodigo, Cidade cidade, String enderecoRua, String enderecoBairro,
			Integer enderecoNumero, Cliente cliente) {
		super();
		this.enderecoCodigo = enderecoCodigo;
		this.cidade = cidade;
		this.enderecoRua = enderecoRua;
		this.enderecoBairro = enderecoBairro;
		this.enderecoNumero = enderecoNumero;
		this.cliente = cliente;
	}

	public Integer getEnderecoCodigo() {
		return enderecoCodigo;
	}

	public void setEnderecoCodigo(Integer enderecoCodigo) {
		this.enderecoCodigo = enderecoCodigo;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getEnderecoRua() {
		return enderecoRua;
	}

	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}

	public String getEnderecoBairro() {
		return enderecoBairro;
	}

	public void setEnderecoBairro(String enderecoBairro) {
		this.enderecoBairro = enderecoBairro;
	}

	public Integer getEnderecoNumero() {
		return enderecoNumero;
	}

	public void setEnderecoNumero(Integer enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
