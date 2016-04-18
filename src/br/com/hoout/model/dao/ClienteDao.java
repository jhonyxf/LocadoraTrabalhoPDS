package br.com.hoout.model.dao;

import java.util.List;

import br.com.hoout.model.domain.Cliente;


public interface ClienteDao {

	Cliente findByCliente(Integer codigo);

	List<Cliente> listar();

	void remover(Cliente cliente);

	Cliente salvarOuAtualizar(Cliente cliente);
}
