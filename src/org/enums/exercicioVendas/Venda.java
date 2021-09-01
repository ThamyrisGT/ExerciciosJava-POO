package org.enums.exercicioVendas;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
	private Produto produto;
	private LocalDate dataCompra;
	private int quant;
	private static double totalVenda;

	public Venda(Produto produto, LocalDate dataCompra, int quant) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quant = quant;
	}

	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuant() {
		return quant;
	}

	public static double getTotalVenda() {
		return totalVenda;
	}

	public void calcularVenda() {
		totalVenda += this.quant * this.produto.getValor();
	}

	public void mostrarVenda() {
		System.out.println(produto.getDescricao() + "\n Valor: R$ " +totalVenda);
	}
}
