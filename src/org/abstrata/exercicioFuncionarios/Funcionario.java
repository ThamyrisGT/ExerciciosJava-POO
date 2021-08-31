package org.abstrata.exercicioFuncionarios;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public Funcionario(String nome, String cpf, double salario, String turno) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.turno = turno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public abstract void aumentarSalario();

}
