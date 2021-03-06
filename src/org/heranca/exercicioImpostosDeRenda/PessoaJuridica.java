package org.heranca.exercicioImpostosDeRenda;

public class PessoaJuridica extends ImpostoDeRenda {
	private String cnpj, inscEstadual;

	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public double CalcularIR() {
		return this.rendimentos * 0.15;
	}

}
