package br.com.hoout.model.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.hoout.model.dao.LocacaoDao;
import br.com.hoout.model.domain.Locacao;
import br.com.hoout.model.service.LocacaoService;




public class LocacaoServiceImpl implements LocacaoService {

	@Inject
	private LocacaoDao dao;

	@Override
	@Transactional
	public void salvar(Locacao locacao) {

		dao.salvarOuAtualizar(locacao);
	}

	@Override
	@Transactional
	public void remover(Integer codigo) {

		dao.remover(dao.findByLocacao(codigo));
	}

	@Override
	public List<Locacao> listarTodos() {

		return dao.listar();
	}

}
