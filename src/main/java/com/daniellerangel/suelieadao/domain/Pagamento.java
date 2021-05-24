package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;

@Entity
public class Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name="pagamentocodigo")
	private Integer pagamentoCodigo;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="clientecodigo")
	private Cliente cliente;
	
	@Column(name="pagamentovalor")
	private Float pagamentoValor;
	
	@Column(name="pagamentodata")
	private Date pagamentoData;
	
	@Column(name="pagamentotipo")
	private String pagamentoTipo;
	
	public Pagamento() {
		
	}

	public Pagamento(Integer pagamentoCodigo, Cliente cliente, Float pagamentoValor, Date pagamentoData,
			String pagamentoTipo) {
		super();
		this.pagamentoCodigo = pagamentoCodigo;
		this.cliente = cliente;
		this.pagamentoValor = pagamentoValor;
		this.pagamentoData = pagamentoData;
		this.pagamentoTipo = pagamentoTipo;
	}

	public Integer getPagamentoCodigo() {
		return pagamentoCodigo;
	}

	public void setPagamentoCodigo(Integer pagamentoCodigo) {
		this.pagamentoCodigo = pagamentoCodigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Float getPagamentoValor() {
		return pagamentoValor;
	}

	public void setPagamentoValor(Float pagamentoValor) {
		this.pagamentoValor = pagamentoValor;
	}

	public Date getPagamentoData() {
		return pagamentoData;
	}

	public void setPagamentoData(Date pagamentoData) {
		this.pagamentoData = pagamentoData;
	}

	public String getPagamentoTipo() {
		return pagamentoTipo;
	}

	public void setPagamentoTipo(String pagamentoTipo) {
		this.pagamentoTipo = pagamentoTipo;
	}
	
}
