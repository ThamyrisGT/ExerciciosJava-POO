package org.abstrata.exercicioFuncionarios;

//Para mostrar que por ser uma classe tamb�m abstrata, ela n�o � obrigada a implementar os m�todos abstratos	 de Funcionario
public abstract class Auxiliar extends Funcionario {
	protected String categoria;

	public Auxiliar(String nome, double salario, String categoria) {
		super(nome, salario);
		this.categoria = categoria;
	}
	
	public abstract void diminuirSalario();

}
