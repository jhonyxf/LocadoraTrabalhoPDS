package br.com.hoout.model.service;

import java.util.List;

import br.com.hoout.model.domain.Veiculo;



public interface VeiculoService {

	void salvar(Veiculo cliente);

	void remover(Integer codigo);

	List<Veiculo> listarTodos();
}
