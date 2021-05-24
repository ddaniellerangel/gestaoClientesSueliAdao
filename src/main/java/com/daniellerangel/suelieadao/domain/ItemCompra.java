package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="item_compra")
public class ItemCompra implements Serializable{
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemCompraPK itemCompraPK;
	
	//para saber se tem o produto em casa
	@Column(name="item_compra_emcasa")
	private Boolean itemCompraEmCasa;
	
	@Column(name="item_compra_qtdtotal")
	private Integer itemCompraQtdTotal;
	
	//para saber a quantidade que será descontada do estoque e a quantidade que será comprada de fora
	@Column(name="item_compra_qtdemcasa")
	private Integer itemCompraQtdEmCasa;
	
	@Column(name="item_compra_valor")
	private Float itemCompraValor;
	
	public ItemCompra(){

	}

	public ItemCompra(ItemCompraPK itemCompraPK, Boolean itemCompraEmCasa, Integer itemCompraQtdTotal,
			Integer itemCompraQtdEmCasa, Float itemCompraValor) {
		super();
		this.itemCompraPK = itemCompraPK;
		this.itemCompraEmCasa = itemCompraEmCasa;
		this.itemCompraQtdTotal = itemCompraQtdTotal;
		this.itemCompraQtdEmCasa = itemCompraQtdEmCasa;
		this.itemCompraValor = itemCompraValor;
	}

	public ItemCompraPK getItemCompraPK() {
		return itemCompraPK;
	}

	public void setItemCompraPK(ItemCompraPK itemCompraPK) {
		this.itemCompraPK = itemCompraPK;
	}

	public Boolean getItemCompraEmCasa() {
		return itemCompraEmCasa;
	}

	public void setItemCompraEmCasa(Boolean itemCompraEmCasa) {
		this.itemCompraEmCasa = itemCompraEmCasa;
	}

	public Integer getItemCompraQtdTotal() {
		return itemCompraQtdTotal;
	}

	public void setItemCompraQtdTotal(Integer itemCompraQtdTotal) {
		this.itemCompraQtdTotal = itemCompraQtdTotal;
	}

	public Integer getItemCompraQtdEmCasa() {
		return itemCompraQtdEmCasa;
	}

	public void setItemCompraQtdEmCasa(Integer itemCompraQtdEmCasa) {
		this.itemCompraQtdEmCasa = itemCompraQtdEmCasa;
	}

	public Float getItemCompraValor() {
		return itemCompraValor;
	}

	public void setItemCompraValor(Float itemCompraValor) {
		this.itemCompraValor = itemCompraValor;
	}
	
	
}

