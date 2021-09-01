package org.enums.exercicioLanchonetes;

import java.time.LocalDate;

public class Pedido {
	private LocalDate data;
	private Bebida bebidas;
	private Sanduiche sanduiches;

	public Pedido(LocalDate data, Bebida bebidas, Sanduiche sanduiches) {
		super();
		this.data = data;
		this.bebidas = bebidas;
		this.sanduiches = sanduiches;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Bebida getBebidas() {
		return bebidas;
	}

	public void setBebidas(Bebida bebidas) {
		this.bebidas = bebidas;
	}

	public Sanduiche getSanduiches() {
		return sanduiches;
	}

	public void setSanduiches(Sanduiche sanduiches) {
		this.sanduiches = sanduiches;
	}

	public static void imprimirCardapio() {
		for (Bebida bebidas : Bebida.values()) {
			System.out.println("--------------------------");
			System.out.println(bebidas.name() + " " + "R$" + bebidas.getPreco());
		}
		for (Sanduiche sanduiches : Sanduiche.values()) {
			System.out.println("--------------------------");
			System.out.println(sanduiches.name() + " " + "R$" + sanduiches.getValor());
		}
	}

	public double calcularPedido() {
		return bebidas.getPreco() + sanduiches.getValor();
	}
}
