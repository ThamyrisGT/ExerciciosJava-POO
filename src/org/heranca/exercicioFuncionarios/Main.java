package org.heranca.exercicioFuncionarios;

public class Main {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Fulano", 10000, "Desenvolvimento");
		Assistente a1 = new Assistente("Ciclano", 2000, 3000);

		g1.AumentarSalario();
		a1.AumentarSalario();

		System.out.println(g1);
		System.out.println(a1);
		System.out.println("O novo salário de: " + g1.getNome() + " é de: " + g1.AumentarSalario());
		System.out.println("O novo salário de: " + a1.getNome() + " é de: " + a1.AumentarSalario());

	}

}
