package com.art.di.notificacao;

import com.art.di.modelo.Cliente;

public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atravéz do SMS: %s \n->%s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
