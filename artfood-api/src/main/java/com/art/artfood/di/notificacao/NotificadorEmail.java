package com.art.artfood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.art.artfood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
	
	@Autowired
	private NotificadorProperties properties;
	
	public NotificadorEmail() {
		System.out.println("Componente Spring: Notificador Email REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("host: " + properties.getHostServidor());
		System.out.println("porta: " + properties.getPortaServidor());
		
 		System.out.printf("REAL: Notificando %s atravéz do email: %s\n->%s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
