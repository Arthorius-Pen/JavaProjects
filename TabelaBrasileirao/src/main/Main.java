package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Tabela tabela = new Tabela();
		Jogo jogo = new Jogo();
		
		Time flamengo = new Time("Flamengo");
		Time fluminese = new Time("fluminese");
		Time vasco = new Time("vasco");
		
		tabela.addTime(flamengo);
		tabela.addTime(fluminese);
		tabela.addTime(vasco);

		
		@SuppressWarnings("resource")
		Scanner inputStr = new Scanner(System.in);
		
		System.out.println("--------------Jogos do Brasileirão--------------");
		tabela.getTabela().forEach(casa -> {
			tabela.getTabela().forEach(visitante -> {
				
				if (casa != visitante) {
					
					jogo.setTimes(casa, visitante);
					
					System.out.println("\nCASA\tvs\tVISITANTE");	
					System.out.println(casa.getNome() + "\tvs\t " + visitante.getNome());	
					
					System.out.println("Digite os PONTOS do time da "+ casa.getNome().toUpperCase() + ":");
						
					int pontosTimeCasa = inputStr.nextInt();
					System.out.println("Digite os GOLS do time da " + casa.getNome().toUpperCase() + ":");
						
					int golsTimeCasa = inputStr.nextInt();
					
					System.out.println("Digite os PONTOS do time da "+ visitante.getNome().toUpperCase() + ":");
					
					int pontosTimeVisitante = inputStr.nextInt();
					System.out.println("Digite os GOLS do time da "+ visitante.getNome().toUpperCase() + ":");
						
					int golsTimeVisitante = inputStr.nextInt();
					
					jogo.addGols(golsTimeCasa, golsTimeVisitante);
					jogo.setPlacar(pontosTimeCasa, pontosTimeVisitante);
					jogo.setGolsContra(pontosTimeCasa, golsTimeCasa, pontosTimeVisitante, golsTimeVisitante);
				}
			});
		});
		System.out.println("FINALIZADO");
		
		tabela.getPrettyTabela();

	}

}
