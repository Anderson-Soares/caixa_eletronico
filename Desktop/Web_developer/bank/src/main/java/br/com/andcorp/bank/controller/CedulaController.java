package br.com.andcorp.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.andcorp.bank.dao.CedulaDAO;
import br.com.andcorp.bank.model.Cedulas;

@CrossOrigin("*")
@RestController
public class CedulaController {

	@Autowired
	private CedulaDAO dao;
	
	@PutMapping("/saque")
	public ResponseEntity<Integer> updateCedulas(Cedulas notas, int troco200, int cedDuzentos, @RequestBody int valorSaque) {
		try {
			cedDuzentos = valorSaque / 200;
			troco200 = valorSaque % 200; 
			notas.setQuantidadeDuzentos(notas.getQuantidadeDuzentos() - cedDuzentos);
			return ResponseEntity.ok(valorSaque);
		} 
		catch(Exception e) {
			// bad request
			return ResponseEntity.status(400).build();
		}		
	}
}
