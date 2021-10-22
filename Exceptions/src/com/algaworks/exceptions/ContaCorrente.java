package com.algaworks.exceptions;

public class ContaCorrente {
	private double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double qtn) {
		this.saldo -= qtn;
	}
	
	public void depositar(double qtn) {
		if (qtn <= 0) {
			throw new IllegalArgumentException("Valor menor ou igual a zero");
		}
		this.saldo += qtn;
	}

}
