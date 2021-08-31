package org.interfaces.exercicioLivrarias;

public class Main {

	public static void main(String[] args) {
		Livro l1 = new Livro("Marco Antônio", "Cisco CCNA", 85.00);
		Livro l2 = new Livro("Kathy Sierra", "Use a cabeça Java", 98.00);
		Operacao o1 = new Operacao("Venda", l1);
		Operacao o2 = new Operacao("Empréstimo", l2);

		l1.reajustar(6);
		o1.vender();
		o2.emprestar();

		System.out.println(o1.toString() + " " + l1.toString());
		System.out.println(o2.toString() + " " + l2.toString());

	}

}
