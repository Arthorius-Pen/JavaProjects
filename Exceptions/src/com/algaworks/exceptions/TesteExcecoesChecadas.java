package com.algaworks.exceptions;

public class TesteExcecoesChecadas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);
		
			try {
				cc.sacar(60);
			} catch (Exception err) {
				System.out.println("Saldo insuficiente");
			}
			System.out.println("Saldo: " + cc.getSaldo());
			
			try {
				cc.sacar(60);
			} catch (SaldoInsuficienteException err) {
				System.out.println("Saldo insuficiente");
			} finally {
				System.out.println("Obrigado por utilizar o sistema");

			}
			System.out.println("Saldo atual: " + cc.getSaldo());			

	}
}
