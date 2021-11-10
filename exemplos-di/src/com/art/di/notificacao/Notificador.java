package com.art.di.notificacao;

import com.art.di.modelo.Cliente;

public interface Notificador {
	void notificar(Cliente cliente, String mensagem);
	
}
