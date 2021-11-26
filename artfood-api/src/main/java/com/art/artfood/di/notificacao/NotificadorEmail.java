package com.art.artfood.di.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.art.artfood.di.modelo.Cliente;

@Primary
@Component
public class NotificadorEmail implements Notificador {
		
	public NotificadorEmail() {
		System.out.println("Componente Spring: Notificador Email");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
 		System.out.printf("Notificando %s atravéz do email: %s\n->%s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
