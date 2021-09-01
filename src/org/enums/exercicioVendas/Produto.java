package org.enums.exercicioVendas;

public class Produto {
	private int cod;
	private String descricao;
	private double valor;
	private Categoria categoria;

	public Produto(int cod, String descricao, double valor, Categoria categoria) {
		super();
		this.cod = cod;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}
}
