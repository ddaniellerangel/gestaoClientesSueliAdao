package com.daniellerangel.suelieadao.resources;

import java.util.ArrayList;
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
	
	@RequestMapping(value="/{cod}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer cod) {
		Estado estado = estadoService.buscaPorId(cod);
		
		return ResponseEntity.ok().body(estado);
		
	}
}
