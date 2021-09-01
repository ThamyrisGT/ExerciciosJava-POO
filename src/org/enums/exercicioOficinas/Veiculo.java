package org.enums.exercicioOficinas;

import java.time.LocalDate;

public class Veiculo implements Oficina {
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	public Veiculo(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.valorCobrado = valorCobrado;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	@Override
	public double lavarVeiculo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double trocarOleo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double revisao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto + "]";
	}
}
