package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Embeddable
public class TelefonePK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="clientecodigo")
	private Cliente cliente;
	
	private String telefonenumero;
	
	public TelefonePK() {
		
	}

	public TelefonePK(Cliente cliente, String telefonenumero) {
		super();
		this.cliente = cliente;
		this.telefonenumero = telefonenumero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTelefonenumero() {
		return telefonenumero;
	}

	public void setTelefonenumero(String telefonenumero) {
		this.telefonenumero = telefonenumero;
	}
}
