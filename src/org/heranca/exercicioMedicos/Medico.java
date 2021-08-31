package org.heranca.exercicioMedicos;

public class Medico extends Plano {
	protected String nome;
	protected int crm;

	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public int getCrm() {
		return crm;
	}

	@Override
	public String toString() {
		return "Medico [nome=" + nome + "  " + valorPago + "]";
	}

	@Override
	public double calcularPagamento() {
		return valorPago = super.calcularPagamento() * 1.10;

	}
}
