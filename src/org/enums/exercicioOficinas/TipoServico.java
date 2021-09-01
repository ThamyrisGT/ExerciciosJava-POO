package org.enums.exercicioOficinas;

public enum TipoServico {
	TROCA_DE_OLEO("Troca de óleo", 100), LAVAR("Lavar", 50), REVISAO("Revisao", 200);

	private final String nome;
	private final double valor;

	private TipoServico(String nome, double valor) {
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
