package exemplos;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {

	public static void main(String[] args) {
		Carro car1 = new Carro("Corsa", 2003);
		Carro car2 = new Carro("HB20", 2017);
		Carro car3 = new Carro("Corolla", 2020);
		Carro car4 = new Carro("Uno Mille", 2010);
		
		Map<String, Carro> carros = new HashMap<String, Carro>();
		
		carros.put("barato", car1);
		carros.put("japaguei", car2);
		carros.put("kamban", car3);
		carros.put("velociter", car4);
		carros.put("velociter", car4);

		imprimirCarros(carros);
	}

	private static void imprimirCarros(Map<String, Carro> carros) {
		for (String id: carros.keySet()) {
			System.out.println("Indexs: " + id);
		}
		
	}

}
