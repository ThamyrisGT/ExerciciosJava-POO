package org.heranca.exercicioPropriedades;

public class Imovel {
	protected String local;
	private double valorImovel;

	public Imovel(String local, double valorImovel) {
		super();
		this.local = local;
		this.valorImovel = valorImovel;
	}

	public double calcularImpostoRenda() {
		return valorImovel * .035;
	}

	@Override
	public String toString() {
		return "[local=" + local + ", valorImovel=" + valorImovel + "]";
	}
}
