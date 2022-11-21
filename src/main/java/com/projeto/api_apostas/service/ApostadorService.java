package com.projeto.api_apostas.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.projeto.api_apostas.models.Apostador;
import com.projeto.api_apostas.models.Dto;
import com.projeto.api_apostas.repositories.ApostadorRepository;

@Service
public class ApostadorService {
	
	@Autowired
	ApostadorRepository apostadorRepository;	
	@Autowired
	ModelMapper modelMapper;

	public void salvaApostador(@RequestBody Dto dto) {
		Apostador apostador = modelMapper.map(dto, Apostador.class);
		apostadorRepository.save(apostador);
	}
}
