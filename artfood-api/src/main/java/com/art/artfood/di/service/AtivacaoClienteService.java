package com.art.artfood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.art.artfood.di.modelo.Cliente;
import com.art.artfood.di.notificacao.NivelUrgencia;
import com.art.artfood.di.notificacao.Notificador;
import com.art.artfood.di.notificacao.TipoDoNotificador;

//@Component
public class AtivacaoClienteService {
	
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	//@PostConstruct
	public void init() {
		System.out.println("INIT");
	}
	
	//@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro está ativo!");

	}
	
}
