package exemplos.equals;

public class Carro {
	private String nome;
	private int ano;

	public Carro(String nome, int ano) {
		this.setNome(nome);
		this.setAno(ano);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
