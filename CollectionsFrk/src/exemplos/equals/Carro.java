package exemplos.equals;

import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		return Objects.hash("J");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals("J", "J");
	}

}
