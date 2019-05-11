package br.com.decolar.controlles;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.decolar.entities.Voo;
import br.com.decolar.services.VoosService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value="VoosController")
@RestController
@RequestMapping(value="/voos", produces=MediaType.APPLICATION_JSON_VALUE)
public class VoosController {

	@Autowired
	private VoosService voosService;
	
	@ApiOperation(httpMethod="GET", value="Buscar voos disponíveis", response=Voo.class, responseContainer="List")
	@ApiResponses(value={
			@ApiResponse(code=200, message="A requisição foi aceita!"),
			@ApiResponse(code=404, message="Voos não encontrados!"),
			@ApiResponse(code=500, message="Voos não podem ser buscados!")
	})
	@GetMapping("/voosdisponiveis1/{voodestino}")
	@ResponseBody
	public List<Voo> getAsyncParallelCalls(@PathVariable String voodestino) throws Throwable {
		CompletableFuture<List<Voo>> voosTam = voosService.buscarVoosDisponiveisDaTam(voodestino);
		CompletableFuture<List<Voo>> voosAzul = voosService.buscarVoosDisponiveisDaAzul(voodestino);
		List<Voo> voos = new ArrayList<>();
		
		try {
			voos.addAll(voosTam.get());
			voos.addAll(voosAzul.get());
		}catch(Throwable e) {
			throw e.getCause();
		}
		
		return voos;
	}
	
	@GetMapping("/voosdisponiveis2/{voodestino}")
	@ResponseBody
	public ResponseEntity<Voo> getAsyncNoParallelCalls(@PathVariable String voodestino) {
		if(voodestino == null) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		try {
			voosService.buscarVoosDisponiveis(voodestino);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}