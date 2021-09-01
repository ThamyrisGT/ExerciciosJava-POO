package org.interfaces.exercicioLivrarias;

public class Operacao implements Livraria {
	private String tipo;
	private double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public String toString() {
		return String.format( "Operacao tipo: %s valor operação R$ %.2f \n",tipo,valorOperacao);
	}

	public void vender() {
		valorOperacao = livro.getValor() + livro.getValor() * 0.09;
		System.out.println(String.format("Valor: R$ %.2f ", valorOperacao));

	}

	public void emprestar() {
		valorOperacao = livro.getValor() * 0.02 + TAXA_EMPRESTIMO;
		System.out.println(String.format("Valor: R$ %.2f ", valorOperacao));
	}
}
