package br.com.decolar.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.decolar.entities.Voo;
import br.com.decolar.entities.VooDto;
import br.com.decolar.repositories.VoosRepository;

@Service
public class VoosService {
	
	@Autowired
	private VoosRepository voosRepository;
	
	@Async
	public CompletableFuture<List<Voo>> buscarVoosDisponiveisDaTam(String voodestino) throws InterruptedException {
		Thread.sleep(20000);
		return CompletableFuture.completedFuture(voosRepository.buscarVoosDisponiveisDaTam(voodestino));
	}
	
	@Async
	public CompletableFuture<List<Voo>> buscarVoosDisponiveisDaAzul(String voodestino) throws InterruptedException {
		Thread.sleep(15000);
		return CompletableFuture.completedFuture(voosRepository.buscarVoosDisponiveisDaAzul(voodestino));
	}
	
	@Async
	public void buscarVoosDisponiveis(String voodestino) throws InterruptedException {
		Thread.sleep(20000);
		List<Voo> voosTam = voosRepository.buscarVoosDisponiveisDaTam(voodestino);
		List<Voo> voosAzul = voosRepository.buscarVoosDisponiveisDaAzul(voodestino);
		List<Voo> voosDisponiveis = new ArrayList<>();
		voosDisponiveis.addAll(voosTam);
		voosDisponiveis.addAll(voosAzul);
		
		String url = "http://localhost:9000/vooscli/voosdisponiveis";
		ResponseEntity<Voo> responseEntity = new RestTemplate().postForEntity(url, new VooDto("1234", voosDisponiveis), Voo.class);
		if(responseEntity.getStatusCode().equals(HttpStatus.OK)) {
			System.out.println("A lista de vôos disponíveis foi enviada ao cliente.");
		}else {
			System.out.println("Erro ao enviar a lista de vôos disponíveis ao cliente.");
		}
	}
}