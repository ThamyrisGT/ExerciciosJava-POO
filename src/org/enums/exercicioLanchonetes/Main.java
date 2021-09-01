package org.enums.exercicioLanchonetes;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		System.out.println("Cardápio: ");
		Pedido.imprimirCardapio();
		
		Pedido p1 = new Pedido(LocalDate.now(),Bebida.SUCO,Sanduiche.XTUDO);
		Pedido p2 = new Pedido(LocalDate.now(),Bebida.REFRIGERANTE,Sanduiche.MISTO);
		
		System.out.println("\n************************");
		System.out.println("Data do pedido : "+ p1.getData()+"\nTotal do Pedido: R$"+ p1.calcularPedido());
		System.out.println("**************************");
		System.out.println("Data do pedido : "+ p2.getData()+"\nTotal do Pedido: R$"+ p2.calcularPedido());

	}

}
