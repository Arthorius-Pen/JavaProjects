package com.art.artfood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.art.artfood.di.notificacao.NivelUrgencia;
import com.art.artfood.di.notificacao.Notificador;
import com.art.artfood.di.notificacao.TipoDoNotificador;
import com.art.artfood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListenert(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro está ativo");
	}
	
}
