package exemplos.equals;

import java.util.Set;
import java.util.HashSet;

public class TesteEquals {
	public static void main(String[] args) {
		Carro car1 = new Carro("Corsa", 2003);
		Carro car2 = new Carro("HB20", 2017);
		Carro car3 = new Carro("Corolla", 2020);
		Carro car4 = new Carro("Uno Mille", 2010);
		Carro car5 = new Carro("Fusca", 300);

		
		Set<Carro> carros = new HashSet<Carro>();
		
		carros.add(car1);
		carros.add(car2);
		carros.add(car3);
		carros.add(car4);
		carros.add(car4);
		carros.add(car5);
		
		Carro fusca = new Carro("Fuscsa", 1000);
		
		if(carros.contains(fusca)) {
			System.out.println("Contém");
		} else {
			System.out.println("Não contém");
		}
		
	}

}
