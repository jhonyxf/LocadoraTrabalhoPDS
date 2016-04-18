package br.com.hoout.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.hoout.model.dao.VeiculoDao;
import br.com.hoout.model.domain.Veiculo;;




public class VeiculoDaoImpl implements VeiculoDao {

	@PersistenceContext(unitName = "LocadoraTrabalhoPDSPU")
	private EntityManager em;

	@Override
	public Veiculo salvarOuAtualizar(Veiculo entity) {

		if (entity.getCodigo() != null) {
			entity = em.merge(entity);
		}

		em.persist(entity);
		
		return entity;
	}

	@Override
	public void remover(Veiculo entity) {

		entity = em.merge(entity);

		em.remove(entity);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Veiculo> listar() {

		Query query = em.createQuery("from Veiculo");

		return query.getResultList();
	}



	@Override
	public Veiculo findByVeiculo(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}



}
