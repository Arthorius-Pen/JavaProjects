package com.art.di.notificacao;

import com.art.di.modelo.Cliente;

public class NotificadorEmail implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atravéz do email: %s \n->%s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
