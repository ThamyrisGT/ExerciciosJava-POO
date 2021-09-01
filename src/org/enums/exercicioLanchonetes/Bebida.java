package org.enums.exercicioLanchonetes;

public enum Bebida {
	REFRIGERANTE("Refrigerante", 3.00), SUCO("Suco", 4.50), AGUA("Água", 1.50);

	private final String nome;
	private final double preco;

	private Bebida(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
}
