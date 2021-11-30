package com.art.artfood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.art.artfood.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador {
		
	public NotificadorEmailMock() {
		System.out.println("Componente Spring: Notificador Email MOCK");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
 		System.out.printf("MOCK: Notificando %s atravéz do email: %s\n->%s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
