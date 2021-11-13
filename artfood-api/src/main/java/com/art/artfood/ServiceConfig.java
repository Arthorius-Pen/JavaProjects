package com.art.artfood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.art.artfood.di.notificacao.Notificador;
import com.art.artfood.di.service.AtivacaoClienteService;


@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
	
}
