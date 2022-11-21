package com.projeto.api_apostas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.api_apostas.models.Dto;
import com.projeto.api_apostas.service.ApostadorService;

@RestController
@RequestMapping("/api")
public class ApostadorController {
	
	@Autowired
    ApostadorService apostadorService;
	
		
	@PostMapping("/apostas")
	public ResponseEntity<?> salvaApostador(@RequestBody Dto dto){
		apostadorService.salvaApostador(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}


















