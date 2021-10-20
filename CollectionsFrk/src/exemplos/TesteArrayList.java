package exemplos;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
	public static void main(String[] args) {
		Carro car1 = new Carro("Corsa", 2003);
		Carro car2 = new Carro("HB20", 2017);
		Carro car3 = new Carro("Corolla", 2020);
		Carro car4 = new Carro("Uno Mille", 2010);
		
		List<Carro> carros = new ArrayList<Carro>();
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("João");
		nomes.add("Jairo");
		nomes.add("Guga");
		nomes.add("Werlyton");
		
		carros.add(car1);
		carros.add(car2);
		carros.add(car3);
		carros.add(car4);
		carros.add(car4);

		
		imprimirCarros(carros);
		imprimirNomes(nomes);
	}
	
	public static void imprimirCarros(List<Carro> carros) {
		for (Carro carro: carros) {
			System.out.println("Nome: " + carro.getNome());
			System.out.println("Ano: " + carro.getAno());
			System.out.println("\n");
		}
	}
	
	public static void imprimirNomes(List<String> nomes) {
		for (String nome: nomes) {
			System.out.println("Nome: " + nome);
		}
	}
}
