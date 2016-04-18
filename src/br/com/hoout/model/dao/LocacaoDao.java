package br.com.hoout.model.dao;

import java.util.List;

import br.com.hoout.model.domain.Locacao;


public interface LocacaoDao {

	Locacao findByLocacao(Integer codigo);

	List<Locacao> listar();

	void remover(Locacao locacao);

	Locacao salvarOuAtualizar(Locacao locacao);
}
