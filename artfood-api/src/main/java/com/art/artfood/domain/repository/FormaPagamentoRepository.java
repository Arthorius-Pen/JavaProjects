package com.art.artfood.domain.repository;

import java.util.List;

import com.art.artfood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {
	List<FormaPagamento> listar();
	FormaPagamento buscar(Long formaPagamentoId);
	FormaPagamento salvar(FormaPagamento formaPagamento);
	void remover(Long formaPagamentoId);
}