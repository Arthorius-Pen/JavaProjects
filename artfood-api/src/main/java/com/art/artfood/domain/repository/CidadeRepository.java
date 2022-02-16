package com.art.artfood.domain.repository;

import java.util.List;

import com.art.artfood.domain.model.Cidade;

public interface CidadeRepository {
	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cidade);
	void remover(Cidade cidade);
}