package br.com.hoout.model.facade.ws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.*;

import br.com.hoout.model.dao.ClienteDao;
import br.com.hoout.model.domain.Cliente;
import br.com.hoout.model.service.ClienteService;


@WebService(serviceName="ws/cliente")
public class ClienteServiceImpl implements ClienteService {

	@Inject
	private ClienteDao dao;

	@Override
	@WebMethod
	public void salvar(Cliente cliente) {

		dao.salvarOuAtualizar(cliente);
	}

	@Override
	@WebMethod
	public void remover(Integer codigo) {

		dao.remover(dao.findByCliente(codigo));
	}

	@Override
	public List<Cliente> listarTodos() {

		return dao.listar();
	}

}
