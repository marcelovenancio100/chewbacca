package br.com.decolar.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.decolar.entities.Voo;

@Repository
public interface VoosRepository {

	public List<Voo> buscarVoosDisponiveisDaTam(String voodestino);
	
	public List<Voo> buscarVoosDisponiveisDaAzul(String voodestino);
}