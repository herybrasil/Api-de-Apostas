package com.projeto.api_apostas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.api_apostas.models.Apostador;

@Repository
public interface ApostadorRepository extends JpaRepository<Apostador, Integer>{

	
}
