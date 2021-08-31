package org.heranca.exercicioVeiculos;

public class Caminhao extends Veiculo {
	private int cargaMaxima;

	public Caminhao() {
		super();
	}

	public Caminhao(String chassi, String placa, String cor, double ipva, int cargaMaxima) {
		super(chassi, placa, cor, ipva);
		this.cargaMaxima = cargaMaxima;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

}
