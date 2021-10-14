package com.algaworks.pagamento.operadoras;

import com.algaworks.pagamento.Cartao;
import com.algaworks.pagamento.Autorizavel;
import com.algaworks.pagamento.Operadora;

public class Recard implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroDoCartao().startsWith("abcd")
				&& autorizavel.getValorTotal() < 100;
	}

}
