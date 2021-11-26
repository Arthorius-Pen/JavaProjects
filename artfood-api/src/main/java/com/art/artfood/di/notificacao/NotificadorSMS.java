package com.art.artfood.di.notificacao;

import org.springframework.stereotype.Component;

import com.art.artfood.di.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
 		System.out.printf("Notificando %s por SMS através do telefone: %s\n->%s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
