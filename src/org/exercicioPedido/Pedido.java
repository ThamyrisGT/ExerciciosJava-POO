package org.exercicioPedido;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	int numero;
	LocalDate dataPedido;
	double quantidade;
	double valor;
	double total;

	public Pedido(int numero, LocalDate dataPedido, double quantidade, double valor) {
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;

	}

	public int getNumero() {
		return numero;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	public double getTotal() {
		return total;
	}

	public void FinalizarPedido() {
		if (this.dataPedido.getDayOfWeek() == DayOfWeek.SUNDAY) {
			this.total = this.quantidade * this.valor * 0.9;
		} else {
			this.total = this.valor * this.quantidade;
		}
	}

//	public String getDataPedido() {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String hoje = this.dataPedido.format(formatter);
//		return hoje;
//	}
}
