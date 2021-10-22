package com.algaworks.dao;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.modelo.Fatura;

public class FaturaDAO {
	public List<Fatura> buscarFaturasVencidas() {
		List<Fatura> faturas = new ArrayList<Fatura>();
		faturas.add(new Fatura("liminha@email.com", 12.93));
		faturas.add(new Fatura("arthur@email.com", 450));
		faturas.add(new Fatura("yaya@email.com", 0));
		faturas.add(new Fatura("lukaku@email.com", 250));
		faturas.add(new Fatura("Otis@email.com", 321));
		faturas.add(new Fatura("port@email.com", 100));



		
		return faturas;

	}
}
