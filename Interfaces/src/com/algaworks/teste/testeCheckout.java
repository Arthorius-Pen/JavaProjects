package com.algaworks.teste;

import com.algaworks.caixa.Checkout;
import com.algaworks.caixa.Compra;
import com.algaworks.impressao.Impressora;
import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Operadora;
import com.algaworks.pagamento.operadoras.Cielo;
import com.algaworks.pagamento.operadoras.ImpressoraEpson;

public class testeCheckout {

	public static void main(String[] args) {
		Operadora operadora = new Cielo();
		Impressora impressora = new ImpressoraEpson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Arthur");
		cartao.setNumeroDoCartao("321");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Arthur");
		compra.setProduto("Rodo");
		compra.setValorTotal(20.40);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
	
}
