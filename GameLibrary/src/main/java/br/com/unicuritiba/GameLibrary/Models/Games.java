package br.com.unicuritiba.GameLibrary.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Game_Library")
public class Games {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Titulo")
	private String Titulo;

	@Column(name = "Data de Lançamento")
	private String Lancamento;

	@Column(name ="Desenvolvidor")
	private String Desenvolvidor;

	@Column(name = "Distribuidora")
	private String Distribuidora;

	@Column(name = "Genero")
	private String Genero;

	@Column(name = "Valor")
	private String Valor;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getLancamento() {
		return Lancamento;
	}
	public void setLancamento(String lancamento) {
		Lancamento = lancamento;
	}
	public String getDesenvolvidor() {
		return Desenvolvidor;
	}
	public void setDesenvolvidor(String desenvolvidor) {
		Desenvolvidor = desenvolvidor;
	}
	public String getDistribuidora() {
		return Distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		Distribuidora = distribuidora;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
	}
}
