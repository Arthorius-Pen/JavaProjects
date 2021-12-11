package main;

public class Main {

	public static void main(String[] args) {
		Tabela tabela = new Tabela();
		
		Time flamengo = new Time("Flamengo");
		Time fluminese = new Time("fluminese");
		Time vasco = new Time("vasco");
		
		tabela.addTime(flamengo);
		tabela.addTime(fluminese);
		tabela.addTime(vasco);

		
		tabela.jogar();
		System.out.println("FINALIZADO");
		
		tabela.getPrettyTabela();

	}

}
