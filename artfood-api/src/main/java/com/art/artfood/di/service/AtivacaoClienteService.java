package com.art.artfood.di.service;

import com.art.artfood.di.modelo.Cliente;
import com.art.artfood.di.notificacao.Notificador;

public class AtivacaoClienteService {
	
	private Notificador notificador;

	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("Ativação cliente: " + notificador);
	}
	
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro está ativo!");
	}
}
