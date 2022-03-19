package com.art.artfood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.art.artfood.domain.model.FormaPagamento;
import com.art.artfood.domain.repository.FormaPagamentoRepository;

@Component
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<FormaPagamento> listar() {
		return manager.createQuery("from FormaPagamento", FormaPagamento.class).getResultList();
	}

	@Override
	public FormaPagamento buscar(Long formaPagamentoId) {
		return manager.find(FormaPagamento.class, formaPagamentoId);
	}
	
	@Transactional
	@Override
	public FormaPagamento salvar(FormaPagamento formaPagamento) {
		return manager.merge(formaPagamento);
	}

	@Transactional
	@Override
	public void remover(Long formaPagamentoId) {
		FormaPagamento formaPagamento = this.buscar(formaPagamentoId);
		
		if (formaPagamento == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		manager.remove(formaPagamento);		
	}

	
}
