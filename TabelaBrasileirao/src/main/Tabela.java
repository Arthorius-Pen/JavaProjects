package main;

import java.util.ArrayList;
import java.util.List;

public class Tabela {
	List<Time> tabela = new ArrayList<Time>();
	
	public void addTime(Time time) {
		tabela.add(time);
	}
	
	public List<Time> getTabela() {
		return tabela;
	}
	
}
