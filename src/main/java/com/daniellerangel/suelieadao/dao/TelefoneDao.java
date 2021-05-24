package com.daniellerangel.suelieadao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniellerangel.suelieadao.domain.Telefone;
import com.daniellerangel.suelieadao.domain.TelefonePK;

@Repository
public interface TelefoneDao extends JpaRepository<Telefone, TelefonePK>{

}
