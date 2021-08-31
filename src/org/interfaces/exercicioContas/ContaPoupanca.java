package org.interfaces.exercicioContas;

public class ContaPoupanca implements Conta {
	private double saldo;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacarConta(double valor) {
		this.saldo -= valor;

	}

	@Override
	public void depositarConta(double valor) {
		this.saldo += valor;

	}

}
