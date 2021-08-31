package org.interfaces.exercicioContas;

public class Cdb implements Conta {
	private double saldo;
	private double Iof;

	public Cdb() {
		super();
	}

	public Cdb(double saldo, double iof) {
		super();
		this.saldo = saldo;
		Iof = iof;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getIof() {
		return Iof;
	}

	public void setIof(double iof) {
		Iof = iof;
	}

	@Override
	public void sacarConta(double valor) {
		this.saldo -= valor + this.Iof;

	}

	@Override
	public void depositarConta(double valor) {
		this.saldo += valor;

	}

}
