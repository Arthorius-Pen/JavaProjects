package com.art.artfood.di.notificacao;

import com.art.artfood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}