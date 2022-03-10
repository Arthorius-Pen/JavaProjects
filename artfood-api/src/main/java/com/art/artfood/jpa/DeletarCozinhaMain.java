package com.art.artfood.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.art.artfood.ArtfoodApiApplication;
import com.art.artfood.domain.model.Cozinha;
import com.art.artfood.domain.repository.CozinhaRepository;

public class DeletarCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ArtfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository =  applicationContext.getBean(CozinhaRepository.class);

		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);

		cozinhaRepository.remover(1L);
	}
}
