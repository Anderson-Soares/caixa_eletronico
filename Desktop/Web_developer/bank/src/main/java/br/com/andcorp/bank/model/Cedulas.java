package br.com.andcorp.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cedulas")
public class Cedulas {
	
	@Column(name="caixa_eletronico")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int caixa;
	
	@Column(name="qtd_duzentos")
	private int quantidadeDuzentos = 100;
	
	@Column(name="qtd_cem")
	private int quantidadeCem = 100;

	public int getCaixa() {
		return caixa;
	}

	public void setCaixa(int caixa) {
		this.caixa = caixa;
	}

	public int getQuantidadeDuzentos() {
		return quantidadeDuzentos;
	}

	public void setQuantidadeDuzentos(int quantidadeDuzentos) {
		this.quantidadeDuzentos = quantidadeDuzentos;
	}

	public int getQuantidadeCem() {
		return quantidadeCem;
	}

	public void setQuantidadeCem(int quantidadeCem) {
		this.quantidadeCem = quantidadeCem;
	}

	public int getQuantidadeCinquenta() {
		return quantidadeCinquenta;
	}

	public void setQuantidadeCinquenta(int quantidadeCinquenta) {
		this.quantidadeCinquenta = quantidadeCinquenta;
	}

	public int getQuantidadeVinte() {
		return quantidadeVinte;
	}

	public void setQuantidadeVinte(int quantidadeVinte) {
		this.quantidadeVinte = quantidadeVinte;
	}

	public int getQuantidadeDez() {
		return quantidadeDez;
	}

	public void setQuantidadeDez(int quantidadeDez) {
		this.quantidadeDez = quantidadeDez;
	}

	public int getQuantidadeCinco() {
		return quantidadeCinco;
	}

	public void setQuantidadeCinco(int quantidadeCinco) {
		this.quantidadeCinco = quantidadeCinco;
	}

	public int getQuantidadeDois() {
		return quantidadeDois;
	}

	public void setQuantidadeDois(int quantidadeDois) {
		this.quantidadeDois = quantidadeDois;
	}

	public int getQuantidadeUm() {
		return quantidadeUm;
	}

	public void setQuantidadeUm(int quantidadeUm) {
		this.quantidadeUm = quantidadeUm;
	}

	@Column(name="qtd_cinquenta")
	private int quantidadeCinquenta = 100;
	
	@Column(name="qtd_vinte")
	private int quantidadeVinte = 100;
	
	@Column(name="qtd_dez")
	private int quantidadeDez = 1000;
	
	@Column(name="qtd_cinco")
	private int quantidadeCinco = 1000;
	
	@Column(name="qtd_dois")
	private int quantidadeDois = 1000;
	
	@Column(name="qtd_um")
	private int quantidadeUm = 1000;
	
}
