package org.abstrata.exercicioFuncionarios;

// Para mostrar que a pr�xima classe n�o abstrata � obrigada a implementar todos os m�todos abstratos acima dela
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
