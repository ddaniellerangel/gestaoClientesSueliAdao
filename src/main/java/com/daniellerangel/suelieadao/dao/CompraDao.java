package com.daniellerangel.suelieadao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniellerangel.suelieadao.domain.Compra;

@Repository
public interface CompraDao extends JpaRepository<Compra, Integer>{

}
