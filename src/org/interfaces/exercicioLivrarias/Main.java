package org.interfaces.exercicioLivrarias;

public class Main {

	public static void main(String[] args) {
		Livro l1 = new Livro("Marco Ant�nio", "Cisco CCNA", 85.00);
		Livro l2 = new Livro("Kathy Sierra", "Use a cabe�a Java", 98.00);
		Operacao o1 = new Operacao("Venda", l1);
		Operacao o2 = new Operacao("Empr�stimo", l2);

		l1.reajustar(6);
		o1.vender();
		o2.emprestar();

		System.out.println(o1.toString() + " " + l1.toString());
		System.out.println(o2.toString() + " " + l2.toString());

	}

}
