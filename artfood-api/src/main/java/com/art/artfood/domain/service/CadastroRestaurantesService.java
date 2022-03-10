package com.art.artfood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.art.artfood.domain.model.Restaurante;
import com.art.artfood.domain.repository.RestauranteRepository;

public class CadastroRestaurantesService {
	
	@Autowired
	private RestauranteRepository restauranteRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		return restauranteRepository.salvar(restaurante);
	}
}
