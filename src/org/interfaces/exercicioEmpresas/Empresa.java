package org.interfaces.exercicioEmpresas;

public class Empresa implements Tributos {
	private String razaoSocial;
	private double rendimentos;

	public Empresa(String razaoSocial, double rendimentos) {
		super();
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public double calcularIrenda() {
		return this.rendimentos * IR_EMPRESA;
	}

	@Override
	public double calcularIcms() {
		return this.rendimentos * ICMS;
	}

	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaoSocial + ", rendimentos=" + rendimentos + "]";
	}

}
