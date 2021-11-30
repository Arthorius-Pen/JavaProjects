package main;

public class Time {
	private String nome;
	private int golsFeitos = 0;
	private int golsSofridos = 0;
	private int pontos = 0;
	
	public Time(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGolsFeitos() {
		return golsFeitos;
	}

	public void setGolsFeitos(int golsFeitos) {
		this.golsFeitos = golsFeitos;
	}

	public int getGolsSofridos() {
		return golsSofridos;
	}

	public void setGolsSofridos(int golsSofridos) {
		this.golsSofridos = golsSofridos;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
	
}
