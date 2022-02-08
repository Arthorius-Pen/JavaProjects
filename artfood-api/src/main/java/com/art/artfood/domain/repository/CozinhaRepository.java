package com.art.artfood.domain.repository;

import java.util.List;

import com.art.artfood.domain.model.Cozinha;

public interface CozinhaRepository {
	List<Cozinha> adicionar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Cozinha cozinha);
}
