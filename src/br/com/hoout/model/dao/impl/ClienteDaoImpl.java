package br.com.hoout.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.hoout.model.dao.ClienteDao;
import br.com.hoout.model.domain.Cliente;


public class ClienteDaoImpl implements ClienteDao {

	@PersistenceContext(unitName = "LocadoraTrabalhoPDSPU")
	private EntityManager em;

	@Override
	public Cliente salvarOuAtualizar(Cliente entity) {

		if (entity.getCodigo() != null) {
			entity = em.merge(entity);
		}

		em.persist(entity);
		
		return entity;
	}

	@Override
	public void remover(Cliente entity) {

		entity = em.merge(entity);

		em.remove(entity);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Cliente> listar() {

		Query query = em.createQuery("from Cliente");

		return query.getResultList();
	}



	@Override
	public Cliente findByCliente(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}



}
