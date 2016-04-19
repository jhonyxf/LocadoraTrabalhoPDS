package br.com.hoout.model.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.hoout.model.dao.LocacaoDao;
import br.com.hoout.model.domain.Locacao;
import br.com.hoout.model.service.LocacaoService;



@WebService(serviceName="ws/locacao")
public class LocacaoServiceImpl implements LocacaoService {

	@Inject
	private LocacaoDao dao;

	@Override
	@WebMethod
	public void salvar(Locacao locacao) {

		dao.salvarOuAtualizar(locacao);
	}

	@Override
	@WebMethod
	public void remover(Integer codigo) {

		dao.remover(dao.findByLocacao(codigo));
	}

	@Override
	@WebMethod
	public List<Locacao> listarTodos() {

		return dao.listar();
	}

}
