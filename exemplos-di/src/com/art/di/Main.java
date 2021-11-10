package com.art.di;

import java.math.BigDecimal;

import com.art.di.modelo.Cliente;
import com.art.di.modelo.Produto;
import com.art.di.notificacao.NotificadorEmail;
import com.art.di.notificacao.NotificadorSMS;
import com.art.di.service.AtivacaoClienteService;
import com.art.di.service.EmissaoNotaFiscal;

public class Main {

	public static void main(String[] args) {
		
		NotificadorSMS notificadorSMS = new NotificadorSMS();
		NotificadorEmail notificadorEmail = new NotificadorEmail();
        BigDecimal big1 = new BigDecimal(10.98);
		
		Cliente joao = new Cliente("João", "joao@email.com", "1243949349");
		
		Produto carrinho = new Produto("Carrinho", big1);
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificadorSMS);
		ativacaoCliente.ativar(joao);
		
		EmissaoNotaFiscal emissaoNotaFiscal = new EmissaoNotaFiscal(notificadorEmail);
		emissaoNotaFiscal.emitir(joao, carrinho);
		
	}

}
