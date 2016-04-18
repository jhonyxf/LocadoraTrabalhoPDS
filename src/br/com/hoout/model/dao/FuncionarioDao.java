package br.com.hoout.model.dao;

import java.util.List;

import br.com.hoout.model.domain.Funcionario;


public interface FuncionarioDao {

	Funcionario findByFuncionario(Integer codigo);

	List<Funcionario> listar();

	void remover(Funcionario funcionario);

	Funcionario salvarOuAtualizar(Funcionario funcionario);
}
