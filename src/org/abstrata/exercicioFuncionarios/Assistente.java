package org.abstrata.exercicioFuncionarios;

public class Assistente extends Funcionario{
	private double adicional;

	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}	

	@Override
	public void aumentarSalario() {
		this.salario*=1.1;
		
	}

	@Override
	public String toString() {
		return "Assistente [adicional=" + adicional +" Salário: "+ getSalario()+"]";
	}
	
	
	

}
