package main;

public class Time implements Comparable<Time>{
	private String nome;
	private int golsFeitos = 0;
	private int golsSofridos = 0;
	private int pontos = 0;
	private int quantidadeDeJogos = 0;
	private int golsContra = 0;
	
	@Override
	public int compareTo(Time outroTime) {
		if (this.pontos > outroTime.getPontos()) {
			return -1;
		}
		if (this.pontos < outroTime.getPontos()) {
			return 1;
		}
		return 0;
	}
	
	public Time(String nome) {
		this.nome = nome;
	}

	public int getGolsContra() {
		return golsContra;
	}

	public void setGolsContra(int golsContra) {
		this.golsContra = golsContra;
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
	
	public int getQuantidadeDeJogos() {
		return quantidadeDeJogos;
	}

	public void setQuantidadeDeJogos(int quantidadeDeJogos) {
		this.quantidadeDeJogos = quantidadeDeJogos;
	}

	

	
}
