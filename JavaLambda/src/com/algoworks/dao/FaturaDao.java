package com.algoworks.dao;

import java.util.List;
import java.util.ArrayList;
import com.algoworks.modelo.Fatura;

public class FaturaDao {
	
	public List<Fatura> buscarFaturasVencidas() {
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("exemplo@email.com", 12.93));
	}
	
}
