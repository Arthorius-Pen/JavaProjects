package com.art.di.service;

import com.art.di.modelo.Cliente;
import com.art.di.modelo.Produto;
import com.art.di.notificacao.Notificador;

public class EmissaoNotaFiscal {
	
	private Notificador notificador;
	
	public EmissaoNotaFiscal(Notificador notificador) {
		this.notificador = notificador;
	}
	
	
	public void emitir(Cliente cliente, Produto produto) {
		this.notificador.notificar(cliente, 
				"Nota fiascal do produto " + produto.getNome() + " foi emitida no  valor de: " + produto.getValorTotal() + "\n");
	}
}
