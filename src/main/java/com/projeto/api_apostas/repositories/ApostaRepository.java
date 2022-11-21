package com.projeto.api_apostas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.api_apostas.models.Aposta;

@Repository
public interface ApostaRepository extends JpaRepository<Aposta, UUID>{

}
