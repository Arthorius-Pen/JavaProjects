package com.art.artfood.jpa;

import org.springframework.context.ApplicationContext;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.art.artfood.ArtfoodApiApplication;
import com.art.artfood.domain.model.Cozinha;

public class BuscarCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ArtfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha =  applicationContext.getBean(CadastroCozinha.class);
		
		
		Cozinha cozinha = cadastroCozinha.buscar(1L);
		
			System.out.println(cozinha.getNome());
	}
}
