package org.exercicioMedicos;

public class Medico {
	private int crm;
	private String nome;
	private double salario;
	private double valorConsulta;
	private static int TotalMedicos;

	public Medico() {
	}

	public Medico(int crm, String nome, double salario, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		TotalMedicos += 1;
	}

	public int getcrm() {
		return this.crm;
	}

	public String getnome() {
		return this.nome;
	}

	public double getsalario() {
		return this.salario;
	}

	public void pagarDinheiro() {
		this.salario += this.valorConsulta;
	}

	public void pagarPlano() {
		this.salario += this.valorConsulta * .7;
	}

	public static int getTotalMedicos() {
		return Medico.TotalMedicos;
	}
}
