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

@Entity(name="cliente")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name="clientecodigo")
	private Integer clienteCodigo;
	
	@Column(name="clientenome")
	private String clienteNome;
	
	@Column(name="clientecpf")
	private String clienteCpf;
	
	@Column(name="clientetotaldeve")
	private double clienteTotalDeve;
	
	@Column(name="clienteultimacompra")
	private Integer clienteUltimaCompra;
	
	@Column(name="clienteultimopagamento")
	private Integer clienteUltimoPagamento;
	
	@JsonManagedReference
	@OneToMany(mappedBy="telefonePK.cliente", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Telefone> listTelefones;
	
	@JsonManagedReference
	@OneToMany(mappedBy="cliente", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Endereco> listEnderecos;
	
	@JsonBackReference
	@OneToMany(mappedBy="cliente", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Compra> listCompras;
	
	@JsonManagedReference
	@OneToMany(mappedBy="cliente", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Pagamento> listPagamentos;
	
	public List<Telefone> getListTelefones() {
		return listTelefones;
	}

	public void setListTelefones(List<Telefone> listTelefones) {
		this.listTelefones = listTelefones;
	}

	public Cliente() {
		
	}

	public Cliente(Integer clienteCodigo, String clienteNome, String clienteCpf, double clienteTotalDeve,
			Integer clienteUltimaCompra, Integer clienteUltimoPagamento) {
		super();
		this.clienteCodigo = clienteCodigo;
		this.clienteNome = clienteNome;
		this.clienteCpf = clienteCpf;
		this.clienteTotalDeve = clienteTotalDeve;
		this.clienteUltimaCompra = clienteUltimaCompra;
		this.clienteUltimoPagamento = clienteUltimoPagamento;
	}

	public Integer getClienteCodigo() {
		return clienteCodigo;
	}

	public void setClienteCodigo(Integer clienteCodigo) {
		this.clienteCodigo = clienteCodigo;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public String getClienteCpf() {
		return clienteCpf;
	}

	public void setClienteCpf(String clienteCpf) {
		this.clienteCpf = clienteCpf;
	}

	public double getClienteTotalDeve() {
		return clienteTotalDeve;
	}

	public void setClienteTotalDeve(double clienteTotalDeve) {
		this.clienteTotalDeve = clienteTotalDeve;
	}

	public Integer getClienteUltimaCompra() {
		return clienteUltimaCompra;
	}

	public void setClienteUltimaCompra(Integer clienteUltimaCompra) {
		this.clienteUltimaCompra = clienteUltimaCompra;
	}

	public Integer getClienteUltimoPagamento() {
		return clienteUltimoPagamento;
	}

	public void setClienteUltimoPagamento(Integer clienteUltimoPagamento) {
		this.clienteUltimoPagamento = clienteUltimoPagamento;
	}

	public List<Compra> getListCompras() {
		return listCompras;
	}

	public void setListCompras(List<Compra> listCompras) {
		this.listCompras = listCompras;
	}

	public List<Pagamento> getListPagamentos() {
		return listPagamentos;
	}

	public void setListPagamentos(List<Pagamento> listPagamentos) {
		this.listPagamentos = listPagamentos;
	}

	public List<Endereco> getListEnderecos() {
		return listEnderecos;
	}

	public void setListEnderecos(List<Endereco> listEnderecos) {
		this.listEnderecos = listEnderecos;
	}
	
	
}
