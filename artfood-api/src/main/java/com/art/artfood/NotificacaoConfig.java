package com.art.artfood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.art.artfood.di.notificacao.NotificadorEmail;


@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.artmail.com.br");
		notificador.setCaixaAlta(false);
		
		return notificador;
	}
	
	
}
