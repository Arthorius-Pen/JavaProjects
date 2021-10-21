package com.algoworks.exemplo;

import java.util.List;
import java.util.ArrayList;

import com.algoworks.dao.FaturaDAO;
import com.algoworks.modelo.Fatura;
import com.algoworks.util.EnviadorEmail;

public class ExemploLambda {
	public static void main(String[] args) {
		List<String> nomes= new ArrayList();

		nomes.add("Luis");
		nomes.add("Fargas");
		nomes.add("Nobruzera Apelao");
		
		nomes.forEach(nome -> {
			System.out.println(nome);
		});
	}
}
