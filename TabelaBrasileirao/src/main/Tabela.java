package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
	
}
