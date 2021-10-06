package com.algoworks.modelo;

public class Fatura {
	
	
	private String emailDevedor;
	private long valor;
	
	public Fatura(String emailDevedor, long valor) {
		this.emailDevedor = emailDevedor;
		this.valor = valor;
	}
	
	public String getEmailDevedor() {
		return emailDevedor;
	}
	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}
	public long getValor() {
		return valor;
	}
	public void setValor(long valor) {
		this.valor = valor;
	}
	
	
	
	
}
