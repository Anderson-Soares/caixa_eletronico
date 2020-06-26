package br.com.andcorp.hello.controller;
import org.springframework.web.bind.annotation.*;

import br.com.andcorp.hello.model.Produto;


@RestController
public class HelloController {
	@GetMapping("/hello")
	public String digaOla() {
		return "<html><body><h1>Olá mundo! Bem-vindo a AndCorp!</h1><hr></body></html>";
	}
	
	@GetMapping("/produto")
	public Produto mostraProduto() {
		Produto p = new Produto();
		p.setId(9876);
		p.setDescricao("Computador core i5 16Gb de RAM, 1 Tera de HD");
		p.setPreco(3500.0f);
		p.setEstoque(8);
		return p;
	}
}
