package com.daniellerangel.suelieadao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniellerangel.suelieadao.domain.Categoria;

@Repository
public interface CategoriaDao extends JpaRepository<Categoria, Integer>{

}
