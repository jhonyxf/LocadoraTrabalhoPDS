package br.com.hoout.model.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.hoout.model.dao.VeiculoDao;
import br.com.hoout.model.domain.Veiculo;
import br.com.hoout.model.service.VeiculoService;




public class VeiculoServiceImpl implements VeiculoService {

	@Inject
	private VeiculoDao dao;

	@Override
	@Transactional
	public void salvar(Veiculo veiculo) {

		dao.salvarOuAtualizar(veiculo);
	}

	@Override
	@Transactional
	public void remover(Integer codigo) {

		dao.remover(dao.findByVeiculo(codigo));
	}

	@Override
	public List<Veiculo> listarTodos() {

		return dao.listar();
	}

}
