package br.com.hoout.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.hoout.model.dao.LocacaoDao;
import br.com.hoout.model.domain.Locacao;




public class LocacaoDaoImpl implements LocacaoDao {

	@PersistenceContext(unitName = "LocadoraTrabalhoPDSPU")
	private EntityManager em;

	@Override
	public Locacao salvarOuAtualizar(Locacao entity) {

		if (entity.getCodigo() != null) {
			entity = em.merge(entity);
		}

		em.persist(entity);
		
		return entity;
	}

	@Override
	public void remover(Locacao entity) {

		entity = em.merge(entity);

		em.remove(entity);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Locacao> listar() {

		Query query = em.createQuery("from Locacao");

		return query.getResultList();
	}



	@Override
	public Locacao findByLocacao(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}



}
