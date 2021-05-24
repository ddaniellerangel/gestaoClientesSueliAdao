package com.daniellerangel.suelieadao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniellerangel.suelieadao.domain.CategoriaProduto;
import com.daniellerangel.suelieadao.domain.CategoriaProdutoPK;

@Repository
public interface CategoriaProdutoDao extends JpaRepository<CategoriaProduto, CategoriaProdutoPK>{

}
