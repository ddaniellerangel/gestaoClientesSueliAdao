package com.daniellerangel.suelieadao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daniellerangel.suelieadao.domain.Estado;
import com.daniellerangel.suelieadao.service.EstadoService;

@RestController
@RequestMapping(value="/estados")
public class EstadoResource {

	@Autowired
	private EstadoService estadoService;
	
	@RequestMapping(value="/{sigla}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable String sigla) {
		Estado estado = estadoService.buscaPorId(sigla.toUpperCase());
		return ResponseEntity.ok().body(estado);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll(){
		List<Estado> listEstados = estadoService.listaEstados();
		return ResponseEntity.ok().body(listEstados);
	}
}
