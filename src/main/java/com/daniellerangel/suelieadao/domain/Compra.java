package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;
import java.util.Date;
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

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;

@Entity(name="compra")
public class Compra implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name="compracodigo")
	private Integer compraCodigo;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="clientecodigo")
	private Cliente cliente;
	
	@Column(name="compradata")
	private Date compraData;
	
	@Column(name="compraqtdprodutos")
	private Integer compraQtdProdutos;
	
	@Column(name="compraconsultor")
	private Boolean compraConsultor;
	
	@Column(name="compravalortotal")
	private Float compraValorTotal;
	
	@Column(name="compradescontoconsultor")
	private Float compraDescontoConsultor;
	
	@Column(name="compravaloraposdesconto")
	private Float compraValorAposDesconto;
	
	@Column(name="compraqtdparcela")
	private Integer compraQtdParcela;
	
	@Column(name="compravalorparcela")
	private Float compraValorParcela;
	
	@JsonManagedReference
	@OneToMany(mappedBy="itemCompraPK.compra", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	List<ItemCompra> listItensCompra;
	
	public Compra() {
		
	}

	public Compra(Integer compraCodigo, Cliente cliente, Date compraData, Integer compraQtdProdutos,
			Boolean compraConsultor, Float compraValorTotal, Float compraDescontoConsultor,
			Float compraValorAposDesconto, Integer compraQtdParcela, Float compraValorParcela) {
		super();
		this.compraCodigo = compraCodigo;
		this.cliente = cliente;
		this.compraData = compraData;
		this.compraQtdProdutos = compraQtdProdutos;
		this.compraConsultor = compraConsultor;
		this.compraValorTotal = compraValorTotal;
		this.compraDescontoConsultor = compraDescontoConsultor;
		this.compraValorAposDesconto = compraValorAposDesconto;
		this.compraQtdParcela = compraQtdParcela;
		this.compraValorParcela = compraValorParcela;
	}

	public Integer getCompraCodigo() {
		return compraCodigo;
	}

	public void setCompraCodigo(Integer compraCodigo) {
		this.compraCodigo = compraCodigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getCompraData() {
		return compraData;
	}

	public void setCompraData(Date compraData) {
		this.compraData = compraData;
	}

	public Integer getCompraQtdProdutos() {
		return compraQtdProdutos;
	}

	public void setCompraQtdProdutos(Integer compraQtdProdutos) {
		this.compraQtdProdutos = compraQtdProdutos;
	}

	public Boolean getCompraConsultor() {
		return compraConsultor;
	}

	public void setCompraConsultor(Boolean compraConsultor) {
		this.compraConsultor = compraConsultor;
	}

	public Float getCompraValorTotal() {
		return compraValorTotal;
	}

	public void setCompraValorTotal(Float compraValorTotal) {
		this.compraValorTotal = compraValorTotal;
	}

	public Float getCompraDescontoConsultor() {
		return compraDescontoConsultor;
	}

	public void setCompraDescontoConsultor(Float compraDescontoConsultor) {
		this.compraDescontoConsultor = compraDescontoConsultor;
	}

	public Float getCompraValorAposDesconto() {
		return compraValorAposDesconto;
	}

	public void setCompraValorAposDesconto(Float compraValorAposDesconto) {
		this.compraValorAposDesconto = compraValorAposDesconto;
	}

	public Integer getCompraQtdParcela() {
		return compraQtdParcela;
	}

	public void setCompraQtdParcela(Integer compraQtdParcela) {
		this.compraQtdParcela = compraQtdParcela;
	}

	public Float getCompraValorParcela() {
		return compraValorParcela;
	}

	public void setCompraValorParcela(Float compraValorParcela) {
		this.compraValorParcela = compraValorParcela;
	}

	public List<ItemCompra> getListItensCompra() {
		return listItensCompra;
	}

	public void setListItensCompra(List<ItemCompra> listItensCompra) {
		this.listItensCompra = listItensCompra;
	}
	
}
