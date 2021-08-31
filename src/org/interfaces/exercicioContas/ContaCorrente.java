package org.interfaces.exercicioContas;

public class ContaCorrente implements Conta {
	private double saldo;
	private double taxa;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(double saldo, double taxa) {
		super();
		this.saldo = saldo;
		this.taxa = taxa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public void sacarConta(double valor) {
		this.saldo += valor;

	}

	@Override
	public void depositarConta(double valor) {
		this.saldo -= valor + taxa;

	}

}
