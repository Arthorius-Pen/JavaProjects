package com.art.artfood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.art.artfood.domain.exeption.EntidadeNaoEncontradaExeption;
import com.art.artfood.domain.model.Estado;
import com.art.artfood.domain.repository.EstadoRepository;

@Service
public class CadastroEstadoService {
	
	@Autowired
	private EstadoRepository estadoReposotory;
	
	public Estado salvar(Estado estado) {
		return estadoReposotory.salvar(estado);
	}
	
	public void remover(Long estadoId) {
		try {
			estadoReposotory.remover(estadoId);
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaExeption(String.format("Estado de código %d, não foi encontrada", estadoId));
		}
	}
}
