package br.com.hoout.model.service;

import java.util.List;

import br.com.hoout.model.domain.Funcionario;



public interface FuncionarioService {

	void salvar(Funcionario cliente);

	void remover(Integer codigo);

	List<Funcionario> listarTodos();
}
