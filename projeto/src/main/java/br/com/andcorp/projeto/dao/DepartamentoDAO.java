package br.com.andcorp.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.andcorp.projeto.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {
	
}
