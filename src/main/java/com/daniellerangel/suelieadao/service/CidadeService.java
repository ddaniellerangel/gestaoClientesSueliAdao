package com.daniellerangel.suelieadao.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.daniellerangel.suelieadao.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniellerangel.suelieadao.dao.CidadeDao;
import com.daniellerangel.suelieadao.domain.Cidade;

@Service
public class CidadeService {

	@Autowired
	CidadeDao cidadeDao;
	
	public Cidade buscaPorId(Integer cod) {
		Optional<Cidade> obj = cidadeDao.findById(cod);
		//return obj.orElse(null);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Cidade não encontrada! Id: " +cod));
	}
	
	public List<Cidade> listaPorEstado(String sigla){
		List<Cidade> listCidades = cidadeDao.findAll();
		List<Cidade> listCidEstado = new ArrayList<>();
		for(Cidade cidade : listCidades) {
			if(cidade.getEstado().getSiglaEstado().equals(sigla.toUpperCase())) {
				listCidEstado.add(cidade);
			}
		}
		return listCidEstado;
	}
}
