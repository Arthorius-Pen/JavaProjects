package com.art.artfood.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.artfood.domain.model.Cozinha;
import com.art.artfood.domain.repository.CozinhaRepository;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

	@Autowired
	private CozinhaRepository cozinhaRepository;

	@GetMapping()
	public List<Cozinha> listar() {
		return cozinhaRepository.listar();
	}
	
	@GetMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> buscar(@PathVariable("cozinhaId") Long cozinhaId) {
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
		
		if(cozinha != null) {
			return ResponseEntity.ok(cozinha); 			
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<Cozinha> adicionar(@RequestBody Cozinha cozinha) {
		Cozinha cozinhaSalva = cozinhaRepository.salvar(cozinha);
		
		return ResponseEntity.status(201).body(cozinhaSalva);
		
	}
	
}
