package com.algoworks.exemplo;

import java.util.List;

import com.algoworks.dao.FaturaDAO;
import com.algoworks.modelo.Fatura;
import com.algoworks.util.EnviadorEmail;

public class ExemploLambda {
	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		EnviadorEmail enviadoEmail = new EnviadorEmail();
		
		/*
		 * for (Fatura f: faturasVencidas) { enviadoEmail.enviar(f.getEmailDevedor(),
		 * f.resumo()); }
		 */
		
		faturasVencidas.forEach(f -> {
			enviadoEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});
	}
}
