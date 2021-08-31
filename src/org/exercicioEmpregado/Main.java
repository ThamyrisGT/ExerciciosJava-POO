package org.exercicioEmpregado;

public class Main {

	public static void main(String[] args) {
		Empregado e1 = new Empregado("fulano", "de tal", 3000);

		Empregado e2 = new Empregado("ciclano", "de tal", 4000);

		e1.CalcularImpostoRenda();
		e2.CalcularImpostoRenda();

		System.out.println(e1.getNome() + " " + e1.getSobrenome() + " Salário: " + e1.getSalario());
		System.out.println(e2.getNome() + " " + e2.getSobrenome() +" Salário: "+ e2.getSalario());

	}

}
