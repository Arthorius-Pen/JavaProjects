package com.art.artfood.domain.repository;

import java.util.List;

import com.art.artfood.domain.model.Cidade;

public interface CidadeRepository {
	List<Cidade> listar();
	Cidade buscar(Long cidadeId);
	Cidade salvar(Cidade cidade);
	void remover(Long cidadeId);
}