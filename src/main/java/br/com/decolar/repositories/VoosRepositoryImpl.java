package br.com.decolar.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.decolar.entities.Voo;

@Repository
public class VoosRepositoryImpl implements VoosRepository {

	public List<Voo> buscarVoosDisponiveisDaTam(String voodestino) {
		List<Voo> voos = new ArrayList<Voo>();
		voos.add(new Voo(1, "TAM", "Brasil", "Alemanha", "12:45", "Boeing 747", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(2, "TAM", "Brasil", "Suiça", "09:45", "Boeing 162", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(3, "TAM", "Brasil", "Suiça", "09:45", "Boeing 162", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(4, "TAM", "Brasil", "Suiça", "09:45", "Boeing 162", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(5, "TAM", "Brasil", "Suiça", "09:45", "Boeing 162", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(6, "TAM", "Brasil", "França", "08:15", "Boeing 747", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(7, "TAM", "Brasil", "Espanha", "07:00", "Boeing 747", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(8, "TAM", "Brasil", "Espanha", "07:00", "Boeing 747", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(9, "TAM", "Brasil", "Espanha", "07:00", "Boeing 747", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(10, "TAM", "Brasil", "Espanha", "07:00", "Boeing 747", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(11, "TAM", "Brasil", "Suécia", "10:00", "Boeing 333", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(12, "TAM", "Brasil", "Dinamarca", "16:10", "Boeing 747", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(13, "TAM", "Brasil", "Estados Unidos", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(14, "TAM", "Brasil", "Estados Unidos", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(15, "TAM", "Brasil", "Estados Unidos", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(16, "TAM", "Brasil", "Estados Unidos", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(17, "TAM", "Brasil", "Estados Unidos", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		
		return voos.stream().filter(voo -> 
		voo.getVoodisponivel().equals(Voo.VOO_DISPONIVEL_SIM) && 
		voo.getVoodestino().equals(voodestino))
				.collect(Collectors.toList());
	}
	
	public List<Voo> buscarVoosDisponiveisDaAzul(String voodestino) {
		List<Voo> voos = new ArrayList<Voo>();
		voos.add(new Voo(1, "Azul", "Brasil", "Turquia", "12:45", "Boeing 747", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(2, "Azul", "Brasil", "Israel", "09:45", "Boeing 162", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(3, "Azul", "Brasil", "Israel", "09:45", "Boeing 162", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(4, "Azul", "Brasil", "Israel", "09:45", "Boeing 162", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(5, "Azul", "Brasil", "Turquia", "09:45", "Boeing 162", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(6, "Azul", "Brasil", "Islândia", "08:15", "Boeing 747", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(7, "Azul", "Brasil", "Islândia", "07:00", "Boeing 747", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(8, "Azul", "Brasil", "Islândia", "07:00", "Boeing 747", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(9, "Azul", "Brasil", "Espanha", "07:00", "Boeing 747", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(10, "Azul", "Brasil", "Espanha", "07:00", "Boeing 747", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(11, "Azul", "Brasil", "Suécia", "10:00", "Boeing 333", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(12, "Azul", "Brasil", "Dinamarca", "16:10", "Boeing 747", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(13, "Azul", "Brasil", "Inglaterra", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(14, "Azul", "Brasil", "Inglaterra", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(15, "Azul", "Brasil", "Inglaterra", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(16, "Azul", "Brasil", "Estados Unidos", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(17, "Azul", "Brasil", "Estados Unidos", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(18, "Azul", "Brasil", "Estados Unidos", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_NAO));
		voos.add(new Voo(19, "Azul", "Brasil", "Estados Unidos", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(20, "Azul", "Brasil", "Nigéria", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		voos.add(new Voo(21, "Azul", "Brasil", "Nigéria", "10:25", "Boeing 424", Voo.VOO_DISPONIVEL_SIM));
		
		return voos.stream().filter(voo -> 
		voo.getVoodisponivel().equals(Voo.VOO_DISPONIVEL_SIM) && 
		voo.getVoodestino().equals(voodestino))
				.collect(Collectors.toList());
	}
}