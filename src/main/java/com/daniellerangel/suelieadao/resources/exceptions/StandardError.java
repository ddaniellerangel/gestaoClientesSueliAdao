package com.daniellerangel.suelieadao.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer statusHTTP;
	private String mensagemError;
	
	public StandardError(Integer statusHTTP, String mensagemError) {
		super();
		this.statusHTTP = statusHTTP;
		this.mensagemError = mensagemError;
	}

	public Integer getStatusHTTP() {
		return statusHTTP;
	}

	public void setStatusHTTP(Integer statusHTTP) {
		this.statusHTTP = statusHTTP;
	}

	public String getMensagemError() {
		return mensagemError;
	}

	public void setMensagemError(String mensagemError) {
		this.mensagemError = mensagemError;
	}
	
	
}
