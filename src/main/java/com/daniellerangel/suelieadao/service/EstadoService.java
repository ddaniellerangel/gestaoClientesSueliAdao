package com.daniellerangel.suelieadao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniellerangel.suelieadao.dao.EstadoDao;
import com.daniellerangel.suelieadao.domain.Estado;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoDao estadoDao;
	
	public Estado buscaPorId(String sigla) {
		Optional<Estado> obj = estadoDao.findById(sigla);
		return obj.orElse(null);
	}
	
	public List<Estado> listaEstados(){
		List<Estado> listEstado = estadoDao.findAll();
		return listEstado;
	}
}
