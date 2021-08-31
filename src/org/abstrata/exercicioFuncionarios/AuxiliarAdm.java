package org.abstrata.exercicioFuncionarios;

// Para mostrar que a próxima classe não abstrata é obrigada a implementar todos os métodos abstratos acima dela
public class AuxiliarAdm extends Auxiliar {

	public AuxiliarAdm(String nome, double salario, String categoria) {
		super(nome, salario, categoria);

	}

	@Override
	public void aumentarSalario() {

	}

	@Override
	public void diminuirSalario() {
	}

}
