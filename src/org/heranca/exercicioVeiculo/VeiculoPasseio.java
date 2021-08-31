package org.heranca.exercicioVeiculo;

public class VeiculoPasseio extends Veiculo {
	private int qtdPortas;

	public VeiculoPasseio() {
		super();
	}

	public VeiculoPasseio(String chassi, String placa, String cor, double ipva, int qtdPortas) {
		super(chassi, placa, cor, ipva);
		this.qtdPortas = qtdPortas;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

}
