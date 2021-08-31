package org.heranca.exercicioVeiculos;

public class Veiculo {
	private String chassi, placa, cor;
	private double ipva;

	public Veiculo() {
		super();
	}

	public Veiculo(String chassi, String placa, String cor, double ipva) {
		super();
		this.chassi = chassi;
		this.placa = placa;
		this.cor = cor;
		this.ipva = ipva;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getIpva() {
		return ipva;
	}

	public void setIpva(double ipva) {
		this.ipva = ipva;
	}

}
