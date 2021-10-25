package exemplos.equals;

import java.util.Set;
import java.util.HashSet;

public class TesteHashSet {
	public static void main(String[] args) {
		Carro car1 = new Carro("Corsa", 2003);
		Carro car2 = new Carro("HB20", 2017);
		Carro car3 = new Carro("Corolla", 2020);
		Carro car4 = new Carro("Uno Mille", 2010);
		
		Set<Carro> carros = new HashSet<Carro>();
		
		carros.add(car1);
		carros.add(car2);
		carros.add(car3);
		carros.add(car4);
		carros.add(car4);
		
		imprimirCarros(carros);
	}
	
	public static void imprimirCarros(Set<Carro> carros) {
		for (Carro carro: carros) {
			System.out.println("Nome: " + carro.getNome());
			System.out.println("Ano: " + carro.getAno());
			
			if(carros.contains(carro)) {
				System.out.println("contem");
			}
			System.out.println("\n");

		}
	}
}
