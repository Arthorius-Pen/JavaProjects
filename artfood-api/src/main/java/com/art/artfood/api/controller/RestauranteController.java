package com.art.artfood.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.artfood.domain.exeption.EntidadeNaoEncontradaExeption;
import com.art.artfood.domain.model.Restaurante;
import com.art.artfood.domain.repository.RestauranteRepository;
import com.art.artfood.domain.service.CadastroRestaurantesService;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {
	
	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CadastroRestaurantesService cadastroRestaurante;
	
	@GetMapping()
	public List<Restaurante> listar() {
		return restauranteRepository.listar();
	}
	
	@GetMapping("/{restauranteId}")
	public ResponseEntity<Restaurante> buscar(@PathVariable Long restauranteId) {
		Restaurante restaurante = restauranteRepository.buscar(restauranteId);
			
		if(restaurante != null) {
			return ResponseEntity.ok(restaurante);			
		}
			 
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody Restaurante restaurante) {
		try {			
			restaurante = cadastroRestaurante.salvar(restaurante);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(restaurante);
			
		} catch (EntidadeNaoEncontradaExeption e) {
			
			return ResponseEntity.badRequest()
					.body(e.getMessage());
		}
	}
	
	@PutMapping("/{restauranteId}")
	public ResponseEntity<?> autualizar(
				@PathVariable("restauranteId") Long restauranteId,
				@RequestBody Restaurante restaurante
			){
		
		Restaurante restauranteAtual = restauranteRepository.buscar(restauranteId);
		
		if(restauranteAtual == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(restaurante, restauranteAtual, "id");
		
		try {			
			restaurante = cadastroRestaurante.salvar(restauranteAtual);
			
			return ResponseEntity.ok(restauranteAtual);
			
		} catch (EntidadeNaoEncontradaExeption e) {
			
			return ResponseEntity.badRequest()
					.body(e.getMessage());
		}
	}
}
