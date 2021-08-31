package org.interfaces.exercicioOlimpiadas;

public class Atleta implements Olimpiada {
	private String nome;
	private double peso;
	private String modalidade;
	private Pais pais;
	private static int totalParticipantes;

	public Atleta(String nome, double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;

	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public Pais getPais() {
		return pais;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	public String verificarSituacao() {
		if (peso > 90) {
			setModalidade("Peso pesado");
			totalParticipantes++;
			return "Participará";
		} else if (peso > 60 && peso < 90) {
			setModalidade("Peso médio");
			totalParticipantes++;
			return "Participará";
		} else {
			return "Não participará";
		}
	}
}
