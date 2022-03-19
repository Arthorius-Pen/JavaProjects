package com.art.artfood.domain.repository;

import java.util.List;

import com.art.artfood.domain.model.Cozinha;

public interface CozinhaRepository {
	List<Cozinha> listar();
	Cozinha buscar(Long cozinhaId);
	Cozinha salvar(Cozinha cozinha);
	void remover(Long cozinhaId);
}
