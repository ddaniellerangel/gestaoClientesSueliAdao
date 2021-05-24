package com.daniellerangel.suelieadao.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniellerangel.suelieadao.domain.ItemCompra;
import com.daniellerangel.suelieadao.domain.ItemCompraPK;

@Repository
public interface ItemCompraDao extends JpaRepository<ItemCompra, ItemCompraPK>{

}
