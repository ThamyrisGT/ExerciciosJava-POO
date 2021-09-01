package org.enums.exercicioVendas;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto(001, "TV", 3000, Categoria.ELETRONICO);
		Produto p2 = new Produto(002, "Celular", 2500, Categoria.ELETRONICO);
		Produto p3 = new Produto(003, "Pneu", 800, Categoria.AUTOMOTIVO);

		Venda v1 = new Venda(p3, LocalDate.now(), 2);
		Venda v2 = new Venda(p2, LocalDate.now(), 3);
		Venda v3 = new Venda(p1, LocalDate.now(), 1);

		System.out.println("----- Itens --------");
		v1.mostrarVenda();
		v1.calcularVenda();
		v2.mostrarVenda();
		v2.calcularVenda();
		v3.mostrarVenda();
		v3.calcularVenda();
		System.out.println("----- Total --------");
		System.out.println("R$ "+Venda.getTotalVenda());

	}

}
