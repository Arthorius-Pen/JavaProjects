package com.algaworks.exceptions;

public class TesteExcecoes {
	public static void main(String[] args) {
		//int num = 5/0; // Lanca: java.lang.ArithmeticException
		
		/*
		 * String s = "Hello"; 
		 * s = null; 
		 * s.toUpperCase();
		 * Lança: java.lang.NullPointerException
		 */
		
		ContaCorrente cc = new ContaCorrente(1000);
		try {		
			cc.depositar(0);
		} catch(IllegalArgumentException e) {
			System.out.println("Não é possível depositar valores menores ou iguais a zero");
			System.out.println("Erro: " + e.getMessage());
		}
		
		System.out.println("Fim do programa");
		
	}
}
