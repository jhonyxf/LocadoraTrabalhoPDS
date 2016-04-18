package br.com.hoout.model.service;

import java.util.List;

import br.com.hoout.model.domain.Cliente;



public interface ClienteService {

	void salvar(Cliente cliente);

	void remover(Integer codigo);

	List<Cliente> listarTodos();
}
