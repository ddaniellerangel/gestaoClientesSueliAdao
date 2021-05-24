package com.daniellerangel.suelieadao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daniellerangel.suelieadao.domain.Cidade;
import com.daniellerangel.suelieadao.service.CidadeService;

@RestController
@RequestMapping(value="/cidades")
public class CidadeResource {
	
	@Autowired
	private CidadeService cidadeService;
	
	@RequestMapping(value="/{cod}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer cod) {
		Cidade cidade = cidadeService.buscaPorId(cod);
		
		return ResponseEntity.ok().body(cidade);
		
	}
	
	@RequestMapping(value="/{siglaUf}/{num}", method = RequestMethod.GET)// "num" é só para diferenciar as url's get, para não
	                                                                   // gerar ambiguidade, será preenchida na aplicação
	public ResponseEntity<?> cidEstado(@PathVariable String siglaUf, Integer num) {
		List<Cidade> listCidEstado = cidadeService.listaPorEstado(siglaUf);
		
		return ResponseEntity.ok().body(listCidEstado);
		
	}

}
