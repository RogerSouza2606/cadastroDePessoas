package br.com.rogerio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rogerio.model.Pessoa;

public interface PessoaRepoitory extends JpaRepository<Pessoa, Long>{

}
