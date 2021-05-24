package com.daniellerangel.suelieadao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniellerangel.suelieadao.domain.Pagamento;

@Repository
public interface PagamentoDao extends JpaRepository<Pagamento, Integer>{

}
