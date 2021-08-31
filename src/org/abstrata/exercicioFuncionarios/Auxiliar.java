package org.abstrata.exercicioFuncionarios;

//Para mostrar que por ser uma classe também abstrata, ela não é obrigada a implementar os métodos abstratos	 de Funcionario
public abstract class Auxiliar extends Funcionario {
	protected String categoria;

	public Auxiliar(String nome, double salario, String categoria) {
		super(nome, salario);
		this.categoria = categoria;
	}
	
	public abstract void diminuirSalario();

}
