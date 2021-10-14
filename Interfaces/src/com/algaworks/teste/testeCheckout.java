package com.algaworks.teste;

import com.algaworks.caixa.Checkout;
import com.algaworks.caixa.Compra;
import com.algaworks.impressao.Impressora;
import com.algaworks.impressao.ImpressoraEpson;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;
import com.algaworks.pagamento.operadoras.Recard;


public class testeCheckout {

	public static void main(String[] args) {
		Operadora operadora = new Recard();
		Impressora impressora = new ImpressoraEpson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Arthur");
		cartao.setNumeroDoCartao("abcd");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Arthur");
		compra.setProduto("Rodo");
		compra.setValorTotal(2000);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
	
}
