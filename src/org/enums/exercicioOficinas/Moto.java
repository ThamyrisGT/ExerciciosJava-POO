package org.enums.exercicioOficinas;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario,int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas=cilindradas;
		
	}

	public int getCilindradas() {
		return cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado += TipoServico.LAVAR.getValor();
	}

	@Override
	public double trocarOleo() {
		return valorCobrado += TipoServico.TROCA_DE_OLEO.getValor();
	}

	@Override
	public double revisao() {
		return valorCobrado += TipoServico.REVISAO.getValor();
	}
}
