package com.art.artfood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.art.artfood.domain.model.Permissao;
import com.art.artfood.domain.repository.PermissaoRepository;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Permissao> listar() {
		return manager.createQuery("from Permissao", Permissao.class).getResultList();
	}

	@Override
	public Permissao buscar(Long permissaoId) {
		return manager.find(Permissao.class, permissaoId);
	}
	
	@Transactional
	@Override
	public Permissao salvar(Permissao permissao) {
		return manager.merge(permissao);
	}

	@Transactional
	@Override
	public void remover(Long permissaoId) {
		Permissao permissao = this.buscar(permissaoId);
		
		if (permissao == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		manager.remove(permissao);		
	}
	
}
