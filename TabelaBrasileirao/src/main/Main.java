package main;

public class Main {

	public static void main(String[] args) {
		Time flamengo = new Time("Flamengo");
		Time fluminese = new Time("Fluminese");
		
		Tabela tabela = new Tabela();
		
		
		tabela.addTime(fluminese);
		tabela.addTime(flamengo);
		
		for (Time time: tabela.getTabela()) {
			System.out.println(time.getGolsFeitos());
		}
		
		flamengo.setGolsFeitos(10);
		fluminese.setGolsFeitos(-8);
		
		System.out.println("---------------------");
		
		for (Time time: tabela.getTabela()) {
			System.out.println(time.getGolsFeitos());
		}
		
	}

}
