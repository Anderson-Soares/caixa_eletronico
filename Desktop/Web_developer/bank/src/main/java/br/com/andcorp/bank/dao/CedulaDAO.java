package br.com.andcorp.bank.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.andcorp.bank.model.Cedulas;

public interface CedulaDAO extends CrudRepository<Cedulas, Integer> {

}
