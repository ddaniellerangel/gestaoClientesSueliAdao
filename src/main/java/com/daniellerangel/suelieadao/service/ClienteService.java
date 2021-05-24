package com.daniellerangel.suelieadao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniellerangel.suelieadao.dao.ClienteDao;
import com.daniellerangel.suelieadao.domain.Cliente;

@Service
public class ClienteService {

	@Autowired
	private ClienteDao clienteDao;
	
	public List<Cliente> listAll(){
		List<Cliente> listClientes = clienteDao.findAll();
		return listClientes;
	}
}
