package br.com.hoout.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.hoout.model.dao.FuncionarioDao;
import br.com.hoout.model.domain.Funcionario;




public class FuncionarioDaoImpl implements FuncionarioDao {

	@PersistenceContext(unitName = "LocadoraTrabalhoPDSPU")
	private EntityManager em;

	@Override
	public Funcionario salvarOuAtualizar(Funcionario entity) {

		if (entity.getCodigo() != null) {
			entity = em.merge(entity);
		}

		em.persist(entity);
		
		return entity;
	}

	@Override
	public void remover(Funcionario entity) {

		entity = em.merge(entity);

		em.remove(entity);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Funcionario> listar() {

		Query query = em.createQuery("from Funcionario");

		return query.getResultList();
	}



	@Override
	public Funcionario findByFuncionario(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}



}
