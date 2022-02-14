package com.art.artfood.jpa;

import org.springframework.context.ApplicationContext;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.art.artfood.ArtfoodApiApplication;
import com.art.artfood.domain.model.Restaurante;
import com.art.artfood.domain.repository.RestauranteRepository;

public class AtualizacaoRestauranteMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ArtfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository =  applicationContext.getBean(RestauranteRepository.class);

		// insert
		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNome("lean");
		long taxa = 10;
		restaurante1.setTaxaFrete(taxa);

		restauranteRepository.salvar(restaurante1);

		// select by id
		Restaurante restaurante2 = restauranteRepository.buscar(3L);
		
		System.out.println(restaurante2.getNome());
		
		// delete
		restaurante1.setId(3L);

		restauranteRepository.remover(restaurante1);
		
		// update
		Restaurante restaurante3 = new Restaurante();
		restaurante3.setId(1L);
		restaurante3.setNome("Copão");
		
		restauranteRepository.salvar(restaurante3);
		
		// select all
		List<Restaurante> restaurantes = restauranteRepository.listar();
		
		for(Restaurante restaurante : restaurantes) {
			System.out.println(restaurante.getNome());
		}
		
	}
}
