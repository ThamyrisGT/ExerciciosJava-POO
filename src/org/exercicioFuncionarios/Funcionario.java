package org.exercicioFuncionarios;

public class Funcionario {
	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getnome() {
		return this.nome;
	}

	public String setnome(String nome) {
		return this.nome;
	}

	public double getsalario() {
		return this.salario;
	}

	public double setsalario() {
		return this.salario;
	}

	public double calcularInss() {
		double resultado = this.salario * 0.11;
		return resultado;
	}

	public double calcularTransporte() {
		double resultado = this.salario * 0.06;
		return resultado;
	}

	public double calcularSalarioLiquido() {
		double resultado = this.salario - this.calcularInss() - this.calcularTransporte();
		return resultado;
	}
}
