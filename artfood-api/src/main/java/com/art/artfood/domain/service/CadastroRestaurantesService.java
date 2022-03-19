package com.art.artfood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.art.artfood.domain.exeption.EntidadeNaoEncontradaExeption;
import com.art.artfood.domain.model.Restaurante;
import com.art.artfood.domain.repository.CozinhaRepository;
import com.art.artfood.domain.repository.RestauranteRepository;

@Service
public class CadastroRestaurantesService {
	
	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		
		if (cozinhaRepository.buscar(cozinhaId) == null) {
			throw new EntidadeNaoEncontradaExeption(
					String.format("Não existe cozinha com o id %d", cozinhaId));
		}
		
		return restauranteRepository.salvar(restaurante);
		
	}
	
	public void remover(Long restauranteId) {
		try {
			restauranteRepository.remover(restauranteId);
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaExeption(String.format("Restaurante de código %d, não foi encontrado", restauranteId));
		}
		
	}
	
}
