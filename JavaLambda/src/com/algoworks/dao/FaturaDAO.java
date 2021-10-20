package com.algoworks.dao;

import java.util.List;
import java.util.ArrayList;
import com.algoworks.modelo.Fatura;

public class FaturaDAO {
	
	public List<Fatura> buscarFaturasVencidas() {
		List<Fatura> faturas = new ArrayList<Fatura>();
		faturas.add(new Fatura("liminha@email.com", 12.93));
		faturas.add(new Fatura("arthur@email.com", 450));
		faturas.add(new Fatura("yaya@email.com", 0));
		
		return faturas;

	}
	
}
