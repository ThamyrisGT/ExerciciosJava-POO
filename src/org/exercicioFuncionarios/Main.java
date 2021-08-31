package org.exercicioFuncionarios;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("João", 3000);
		f1.calcularInss();
		f1.calcularTransporte();
		f1.calcularSalarioLiquido();

		System.out.println(f1.getnome() + "\nSalário  " + f1.getsalario() + " " + "\nINSS:" + f1.calcularInss()
				+ "\nTransporte: " + f1.calcularTransporte() + "\n Salário Líquido:" + f1.calcularSalarioLiquido());

	}

}
