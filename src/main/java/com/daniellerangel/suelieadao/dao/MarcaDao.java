package com.daniellerangel.suelieadao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniellerangel.suelieadao.domain.Marca;

@Repository
public interface MarcaDao extends JpaRepository<Marca, Integer>{

}
