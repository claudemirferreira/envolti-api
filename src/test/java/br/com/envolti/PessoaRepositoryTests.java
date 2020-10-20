package br.com.envolti;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.envolti.model.Pessoa;
import br.com.envolti.service.PessoaServicoImpl;

@SpringBootTest
class PessoaRepositoryTests {

	@Autowired
	private PessoaServicoImpl service;

	@Test
	void contextLoads() {
		service.salvar(new Pessoa(null, "JOÃO", "M", "CLAUDEMIR@GMAIL.COM", "MANAUS", "BRASILEIRO", "60735090220"));
	}

}
