package com.daniellerangel.suelieadao.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="categoria_produto")
public class CategoriaProduto {

	@EmbeddedId
	private CategoriaProdutoPK categoriaProdutoPK;
	
	public CategoriaProduto() {
		
	}

	public CategoriaProduto(CategoriaProdutoPK categoriaProdutoPK) {
		super();
		this.categoriaProdutoPK = categoriaProdutoPK;
	}

	public CategoriaProdutoPK getCategoriaProdutoPK() {
		return categoriaProdutoPK;
	}

	public void setCategoriaProdutoPK(CategoriaProdutoPK categoriaProdutoPK) {
		this.categoriaProdutoPK = categoriaProdutoPK;
	}
	
	
}
