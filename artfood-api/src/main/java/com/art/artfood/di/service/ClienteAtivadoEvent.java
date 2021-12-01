package com.art.artfood.di.service;

import com.art.artfood.di.modelo.Cliente;

public class ClienteAtivadoEvent {
	
	private Cliente cliente;
	
	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
}
