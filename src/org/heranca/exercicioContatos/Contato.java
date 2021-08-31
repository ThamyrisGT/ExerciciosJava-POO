package org.heranca.exercicioContatos;

public class Contato {
	private String nome;
	private Telefone[] telefones;
	private Endereco endereco;

	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public Telefone[] getTelefone() {
		return telefones;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefones = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void mostrarTelefones() {
		for (int i = 0; i < telefones.length; i++) {
			System.out.println("Telefone: " + telefones[i].getNumero());
		}
	}
}
