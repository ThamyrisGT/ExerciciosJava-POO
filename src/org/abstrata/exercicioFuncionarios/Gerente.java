package org.abstrata.exercicioFuncionarios;

public class Gerente extends Funcionario {

	private String nivel;

	public Gerente(String nome, double salario, String nivel) {
		super(nome, salario);
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public void aumentarSalario() {
		this.salario=this.salario*1.15+500;
	}

	@Override
	public String toString() {
		return "Gerente [nivel=" + nivel +" Salário: "+ getSalario()+ "]";
	}
	
	

}
