package org.enums.exercicioOficinas;

import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public Carro(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado += TipoServico.LAVAR.getValor();
	}

	@Override
	public double trocarOleo() {
		if (dataConserto.getDayOfWeek().name().equals("SATURDAY")) {
			valorCobrado = valorCobrado + TipoServico.TROCA_DE_OLEO.getValor() - 50;
		} else {
			valorCobrado = valorCobrado + TipoServico.TROCA_DE_OLEO.getValor();
		}
		return valorCobrado;
	}

	@Override
	public double revisao() {
		if (dataConserto.getMonth() == Month.AUGUST) {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValor() * 0.90;
		} else {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValor();
		}
		return valorCobrado;
	}
}
