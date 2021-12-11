package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tabela {
	List<Time> tabela = new ArrayList<Time>();
	Jogo jogo = new Jogo();
	
	public void addTime(Time time) {
		tabela.add(time);
	}
	
	public List<Time> getTabela() {
		return tabela;
	}
	
	public void getPrettyTabela() {
		Collections.sort(this.tabela);
		System.out.println("\n------------TABELA BRASILEIRÃO------------");
		System.out.println("NOME|\tPONTOS|\tSALDO DE GOLS|\tGOLS CONTRA|");
		this.tabela.forEach( time -> {
			int saldoGols = time.getGolsFeitos() - time.getGolsSofridos();
			System.out.println(time.getNome()+ "|\t" + time.getPontos() + "|\t" + saldoGols + "|\t" + time.getGolsContra() + "|");
		});
	}
	
	public void jogar() {
		
		Scanner inputStr = new Scanner(System.in);
		
		System.out.println("--------------Jogos do Brasileirão--------------");
		tabela.forEach(casa -> {
			tabela.forEach(visitante -> {
				
				if (casa != visitante) {
					
					jogo.setTimes(casa, visitante);
					
					System.out.println("\nCASA\tvs\tVISITANTE");	
					System.out.println(casa.getNome() + "\tvs\t " + visitante.getNome());	
					
					System.out.println("Digite os PONTOS do time da CASA:");
						
					int pontosTimeCasa = inputStr.nextInt();
					System.out.println("Digite os GOLS do time da CASA:");
						
					int golsTimeCasa = inputStr.nextInt();
					
					System.out.println("Digite os PONTOS do time da VISITANTE:");
					
					int pontosTimeVisitante = inputStr.nextInt();
					System.out.println("Digite os GOLS do time da VISITANTE:");
						
					int golsTimeVisitante = inputStr.nextInt();
					
					jogo.addGols(golsTimeCasa, golsTimeVisitante);
					jogo.setPlacar(pontosTimeCasa, pontosTimeVisitante);
					jogo.setGolsContra(pontosTimeCasa, golsTimeCasa, pontosTimeVisitante, golsTimeVisitante);
				}
			});
		});
	}
	
}
