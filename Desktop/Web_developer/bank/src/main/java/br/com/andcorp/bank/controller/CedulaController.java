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
	public ResponseEntity<Integer> updateCedulas(Cedulas notas, @RequestBody int valorSaque) {
		try {
			final int cedDuzentos = valorSaque / 200;
			notas.setQuantidadeDuzentos(notas.getQuantidadeDuzentos() - cedDuzentos);
			
			return ResponseEntity.ok(valorSaque);
		} 
		catch(Exception e) {
			// bad request
			return ResponseEntity.status(400).build();
		}		
	}
	/*
	@PutMapping("/saque")
	public ResponseEntity<Integer> updateCedulas(Cedulas notas, int troco200, int troco100,
			int troco50, int troco20, int troco10, int troco5, int troco2, int troco1,
			int cedDuzentos, int cedCem, int cedCinquenta, int cedVinte, int cedDez,
			int cedCinco, int cedDois, int cedUm, @RequestBody int valorSaque) {
		try {
			final int troco200;
			cedDuzentos = valorSaque / 200;
			troco200 = valorSaque % 200; 
			notas.setQuantidadeDuzentos(notas.getQuantidadeDuzentos() - cedDuzentos);
			
			final int troco200;
			
			cedCem = troco200 / 100;
			troco100 = troco200 % 100;
			notas.setQuantidadeCem(notas.getQuantidadeCem() - cedCem);
			
			cedCinquenta = troco100 / 50;
			troco100 = troco100 % 50;
			notas.setQuantidadeCinquenta(notas.ge - cedCem);
			
			cedCem = troco200 / 100;
			troco100 = troco200 % 100;
			notas.setQuantidadeCem(notas.getQuantidadeCem() - cedCem);
			
			return ResponseEntity.ok(valorSaque);
		} 
		catch(Exception e) {
			// bad request
			return ResponseEntity.status(400).build();
		}		
	}
	*/
}
