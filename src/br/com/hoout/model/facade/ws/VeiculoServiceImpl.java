package br.com.hoout.model.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.hoout.model.dao.VeiculoDao;
import br.com.hoout.model.domain.Veiculo;
import br.com.hoout.model.service.VeiculoService;



@WebService(serviceName="ws/veiculo")
public class VeiculoServiceImpl implements VeiculoService {

	@Inject
	private VeiculoDao dao;

	@Override
	@WebMethod
	public void salvar(Veiculo veiculo) {

		dao.salvarOuAtualizar(veiculo);
	}

	@Override
	@WebMethod
	public void remover(Integer codigo) {

		dao.remover(dao.findByVeiculo(codigo));
	}

	@Override
	@WebMethod
	public List<Veiculo> listarTodos() {

		return dao.listar();
	}

}
