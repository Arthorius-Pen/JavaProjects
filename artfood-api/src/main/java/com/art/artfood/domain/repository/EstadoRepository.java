package com.art.artfood.domain.repository;

import java.util.List;

import com.art.artfood.domain.model.Estado;

public interface EstadoRepository {
	List<Estado> listar();
	Estado buscar(Long estadoId);
	Estado salvar(Estado estado);
	void remover(Long estadoId);
}