package com.art.artfood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.art.artfood.di.modelo.Cliente;

@Profile("producao")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {
		
	public NotificadorEmail() {
		System.out.println("Componente Spring: Notificador Email REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
 		System.out.printf("REAL: Notificando %s atravéz do email: %s\n->%s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
