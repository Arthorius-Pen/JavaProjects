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
		cc.depositar(0);
		
	}
}
