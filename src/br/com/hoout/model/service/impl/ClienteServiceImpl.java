package br.com.hoout.model.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.hoout.model.dao.ClienteDao;
import br.com.hoout.model.domain.Cliente;
import br.com.hoout.model.service.ClienteService;



public class ClienteServiceImpl implements ClienteService {

	@Inject
	private ClienteDao dao;

	@Override
	@Transactional
	public void salvar(Cliente cliente) {

		dao.salvarOuAtualizar(cliente);
	}

	@Override
	@Transactional
	public void remover(Integer codigo) {

		dao.remover(dao.findByCliente(codigo));
	}

	@Override
	public List<Cliente> listarTodos() {

		return dao.listar();
	}

}
