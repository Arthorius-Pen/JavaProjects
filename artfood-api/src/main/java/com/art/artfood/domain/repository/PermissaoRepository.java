package com.art.artfood.domain.repository;

import java.util.List;

import com.art.artfood.domain.model.Permissao;

public interface PermissaoRepository {
	List<Permissao> listar();
	Permissao buscar(Long permissaoId);
	Permissao salvar(Permissao permissao);
	void remover(Long permissaoId);
}