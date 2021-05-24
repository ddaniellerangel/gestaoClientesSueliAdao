package com.daniellerangel.suelieadao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="telefone")
public class Telefone implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TelefonePK telefonePK;
	
	@Column(name="telefonecelular")
	private Boolean telefoneCelular;
	
	public Telefone() {
		
	}

	public Telefone(TelefonePK telefonePK, Boolean telefoneCelular) {
		super();
		this.telefonePK = telefonePK;
		this.telefoneCelular = telefoneCelular;
	}

	public TelefonePK getTelefonePK() {
		return telefonePK;
	}

	public void setTelefonePK(TelefonePK telefonePK) {
		this.telefonePK = telefonePK;
	}

	public Boolean getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(Boolean telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	
}
