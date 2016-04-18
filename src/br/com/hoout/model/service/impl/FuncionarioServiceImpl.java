package br.com.hoout.model.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.hoout.model.dao.FuncionarioDao;
import br.com.hoout.model.domain.Funcionario;
import br.com.hoout.model.service.FuncionarioService;




public class FuncionarioServiceImpl implements FuncionarioService {

	@Inject
	private FuncionarioDao dao;

	@Override
	@Transactional
	public void salvar(Funcionario funcionario) {

		dao.salvarOuAtualizar(funcionario);
	}

	@Override
	@Transactional
	public void remover(Integer codigo) {

		dao.remover(dao.findByFuncionario(codigo));
	}

	@Override
	public List<Funcionario> listarTodos() {

		return dao.listar();
	}

}
