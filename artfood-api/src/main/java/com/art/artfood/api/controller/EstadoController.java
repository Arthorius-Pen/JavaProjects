package com.art.artfood.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.art.artfood.domain.exeption.EntidadeNaoEncontradaExeption;
import com.art.artfood.domain.model.Estado;
import com.art.artfood.domain.repository.EstadoRepository;
import com.art.artfood.domain.service.CadastroEstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CadastroEstadoService cadastroEstado;
	
	@GetMapping
	public List<Estado> listar() {
		return estadoRepository.listar();
	}
	
	@GetMapping("/{estadoId}")
	public ResponseEntity<Estado> buscar(@PathVariable Long estadoId) {
		Estado estado = estadoRepository.buscar(estadoId);
		
		if(estado == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(estado);
	}
	
	@PostMapping
	public ResponseEntity<Estado> salvar(@RequestBody Estado estado) {
		estado = cadastroEstado.salvar(estado);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(estado);
	}
	
	@PutMapping("/{estadoId}")
	public ResponseEntity<Estado> atualizar(
				@PathVariable Long estadoId,
				@RequestBody Estado estado
			) {
		
		Estado estadoAtual = estadoRepository.buscar(estadoId);
		
		if(estadoAtual == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(estado, estadoAtual, "id");
		
		estado = cadastroEstado.salvar(estadoAtual);
		
		return ResponseEntity.ok(estado);
	}
	
	@DeleteMapping("/{estadoId}")
	public ResponseEntity<Estado> deletar(@PathVariable Long estadoId) {
		try {
			cadastroEstado.remover(estadoId);
			
			return ResponseEntity.noContent().build();
		} catch (EntidadeNaoEncontradaExeption e) {
			return ResponseEntity.notFound().build();
		}
	}
}
