package com.art.artfood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.art.artfood.di.modelo.Cliente;
import com.art.artfood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private List<Notificador> notificadores;

//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//		
//		System.out.println("Ativação cliente: " + notificador);
//	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		//this.notificador.notificar(cliente, "Seu cadastro está ativo!");
		for (Notificador notificador: notificadores) {
			notificador.notificar(cliente, "Seu cadastro está ativo!");
		}
	}
	
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
}
