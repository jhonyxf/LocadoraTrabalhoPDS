package br.com.hoout.model.service;

import java.util.List;

import br.com.hoout.model.domain.Locacao;



public interface LocacaoService {

	void salvar(Locacao cliente);

	void remover(Integer codigo);

	List<Locacao> listarTodos();
}
