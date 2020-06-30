package br.com.andcorp.projeto.dao;

import java.util.List;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

import br.com.andcorp.projeto.model.AgenteFinanceiro;

public interface AgenteFinanceiroDAO extends CrudRepository<AgenteFinanceiro, Integer> {
	public List<AgenteFinanceiro> findAllByOrderByVolumeDesc();
		
	}
