package org.heranca.exercicioMaratonista;

public class Maratonista {
	protected String nome;
	protected String sexo;
	protected int idade;
	protected double altura;

	public Maratonista(String nome, String sexo, int idade, double altura) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void verificarSituacao() {
		if (this.idade > 18 || this.altura >= 1.80) {
			System.out.println("Poderá participar");
		} else {
			System.out.println("Não poderá participar");
		}
	}

	@Override
	public String toString() {
		return "Maratonista [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", altura=" + altura + "]";
	}

}
