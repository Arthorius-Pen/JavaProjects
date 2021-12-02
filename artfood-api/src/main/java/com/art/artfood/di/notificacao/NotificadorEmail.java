package com.art.artfood.di.notificacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.art.artfood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {
	
	@Value("${usando.uma.variavel.qualquer}")
	public String qualquerCoisa;
	
	public NotificadorEmail() {
		System.out.println("Componente Spring: Notificador Email REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Variavel de ambiente criada: " + qualquerCoisa);
		
 		System.out.printf("REAL: Notificando %s atravéz do email: %s\n->%s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
