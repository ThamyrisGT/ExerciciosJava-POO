package org.exercicioPedidos;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Pedido p1 = new Pedido(001, LocalDate.of(2021, 05, 22), 2, 5.0);
		Pedido p2 = new Pedido(003, LocalDate.of(2021, 04, 25), 2, 10.0);
		Pedido p3 = new Pedido(004, LocalDate.of(2021, 03, 24), 3, 7.0);

		p1.finalizarPedido();
		p2.finalizarPedido();
		p3.finalizarPedido();

		System.out.println(" O valor total do pedido 1 foi de : " + p1.getTotal());
		System.out.println(" O valor total do pedido 2 foi de : " + p2.getTotal());
		System.out.println(" O valor total do pedido 3 foi de : " + p3.getTotal());

	}

}
