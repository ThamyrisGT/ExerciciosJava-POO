package org.exercicioEmpregado;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salario;

	public Empregado (String nome, String sobrenome, double salario) {
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.salario = salario;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void CalcularImpostoRenda() {
		if (this.salario < 1903.98) {
			this.salario = this.salario - 0;
		} else if (this.salario <= 2826.25) {
			this.salario = this.salario - this.salario * 0.075;
		} else if (this.salario <= 3751.05) {
			this.salario = this.salario - this.salario * 0.15;
		} else if (this.salario <= 4664.68) {
			this.salario = this.salario - this.salario * 0.225;
		} else if (this.salario > 4664.68) {
			this.salario = this.salario - this.salario * 0.275;
		}
	}
}
