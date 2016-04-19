package br.com.hoout.model.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.hoout.model.dao.FuncionarioDao;
import br.com.hoout.model.domain.Funcionario;
import br.com.hoout.model.service.FuncionarioService;



@WebService(serviceName="ws/funcionario")
public class FuncionarioServiceImpl implements FuncionarioService {

	@Inject
	private FuncionarioDao dao;

	@Override
	@WebMethod
	public void salvar(Funcionario funcionario) {

		dao.salvarOuAtualizar(funcionario);
	}

	@Override
	@WebMethod
	public void remover(Integer codigo) {

		dao.remover(dao.findByFuncionario(codigo));
	}

	@Override
	@WebMethod
	public List<Funcionario> listarTodos() {

		return dao.listar();
	}

}
