package com.algaworks.teste;

import java.util.List;
import java.util.stream.Stream;

import com.algaworks.dao.FaturaDAO;
import com.algaworks.modelo.Fatura;

public class Teste {

	public static void main(String[] args) {
		List<Fatura> faturas = new FaturaDAO().buscarFaturasVencidas();
		
		faturas.stream()
			.filter(Fatura::estaEmRisco)
			.forEach(System.out::println);
		 
	}

}
