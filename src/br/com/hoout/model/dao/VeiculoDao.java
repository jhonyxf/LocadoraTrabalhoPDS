package br.com.hoout.model.dao;

import java.util.List;

import br.com.hoout.model.domain.Veiculo;


public interface VeiculoDao {

	Veiculo findByVeiculo(Integer codigo);

	List<Veiculo> listar();

	void remover(Veiculo veiculo);

	Veiculo salvarOuAtualizar(Veiculo veiculo);
}
