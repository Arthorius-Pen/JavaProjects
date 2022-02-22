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
					
					boolean diferentes = jogo.setTimes(casa, visitante);
					
					if(!diferentes) {
						System.out.println("Jogo intválido: Os times são iguais!");
					}
					
					System.out.println("\nCASA\tvs\tVISITANTE");	
					System.out.println(casa.getNome() + "\tvs\t " + visitante.getNome());	
					
					System.out.println("Digite os PONTOS do time "+ casa.getNome().toUpperCase() + ":");	
					int pontosTimeCasa = inputStr.nextInt();
					
					System.out.println("Digite os GOLS do time " + casa.getNome().toUpperCase() + ":");
					int golsTimeCasa = inputStr.nextInt();
					
					System.out.println("Digite os gols CONTRA do time " + casa.getNome().toUpperCase() + ":");
					int golsContraTimeCasa = inputStr.nextInt();
					
					System.out.println("Digite os PONTOS do time "+ visitante.getNome().toUpperCase() + ":");
					int pontosTimeVisitante = inputStr.nextInt();
					
					System.out.println("Digite os GOLS do time "+ visitante.getNome().toUpperCase() + ":");	
					int golsTimeVisitante = inputStr.nextInt();
					
					System.out.println("Digite os gols CONTRA do time " + visitante.getNome().toUpperCase() + ":");
					int golsContraTimeVisitante = inputStr.nextInt();
					
					jogo.addGols(golsTimeCasa, golsTimeVisitante);
					jogo.setPlacar(pontosTimeCasa, pontosTimeVisitante);
					jogo.setGolsContra(golsContraTimeCasa, golsContraTimeVisitante);
				}
			});
		});
		System.out.println("FINALIZADO");
		
		tabela.getPrettyTabela();

	}

}
