package org.abstrata.exercicioFuncionarios;

public class Diretor extends Funcionario {
	private String categoria;

	public Diretor(String nome, double salario, String categoria) {
		super(nome, salario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public void aumentarSalario() {
		this.salario=this.salario*1.1+1000;
		
	}

	@Override
	public String toString() {
		return "Diretor [categoria=" + categoria+ " Salário: "+ getSalario()+ "]";
	}
	
	
	
	
}
