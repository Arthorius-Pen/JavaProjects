package com.art.artfood.di.notificacao;

import com.art.artfood.di.modelo.Cliente;


public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("Componente Spring: Notificador Email");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
 		System.out.printf("Notificando %s atravéz do email: %s. Usando o SMTP: %s \n->%s\n", 
				cliente.getNome(), cliente.getEmail(), hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
