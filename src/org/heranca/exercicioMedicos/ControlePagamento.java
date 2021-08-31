package org.heranca.exercicioMedicos;

public class ControlePagamento {
	private double totalPago = 0;

	public double getTotalPago() {
		return totalPago;
	}

	public void calcularTotalPago(Plano plano) {
		totalPago = totalPago + plano.getValorPago();
	}
}
