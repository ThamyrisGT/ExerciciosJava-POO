package org.enums.exercicioLanchonetes;

public enum Sanduiche {
	MISTO("Misto", 3.00), HAMBURGUER("Hamburguer", 5.50), XTUDO("X Tudo", 10.00);

	private final String nome;
	private final double valor;

	private Sanduiche(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
}
