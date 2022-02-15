package com.art.artfood.jpa;

import org.springframework.context.ApplicationContext;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.art.artfood.ArtfoodApiApplication;
import com.art.artfood.domain.model.Restaurante;
import com.art.artfood.domain.repository.RestauranteRepository;

public class ForeingRestauranteMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ArtfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository =  applicationContext.getBean(RestauranteRepository.class);

		// select all
		List<Restaurante> restaurantes = restauranteRepository.listar();
		
		for(Restaurante restaurante : restaurantes) {
			System.out.printf("%s - %d - %s\n", restaurante.getNome(), 
					restaurante.getTaxaFrete(), restaurante.getCozinha().getNome());
		}
		
	}
}
