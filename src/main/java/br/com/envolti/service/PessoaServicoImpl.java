package br.com.envolti.service;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.envolti.model.Pessoa;
import br.com.envolti.repository.PessoaRepositorio;

@Service
public class PessoaServicoImpl implements Serializable {

	private static final long serialVersionUID = -5220391642354623929L;

	@Autowired
	private PessoaRepositorio repositorio;

	public List<Pessoa> listarTodos() {
		return this.repositorio.findAll();
	}

	public Pessoa salvar(Pessoa entity) {
		entity.setDataCadastro(LocalDate.now());
		entity.setDataAtualizacao(null);
		return this.repositorio.save(entity);
	}

	public Pessoa atualizar(Pessoa entity) {
		entity.setDataAtualizacao(LocalDate.now());
		return this.repositorio.save(entity);
	}

	public void remover(Pessoa entity) {
		this.repositorio.delete(entity);

	}

}