package org.relacionamentoClasses.exercicioTimes;

public class Time {
	private String nome;
	private String tecnico;
	private Atleta[] atletas;

	public Time(Atleta[] atletas) {
		this.atletas = atletas;
	}

	public Time(String nome, String tecnico, Atleta[] atletas) {
		super();
		this.nome = nome;
		this.tecnico = tecnico;
		this.atletas = atletas;

	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}

	public String getNome() {
		return nome;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public void adicionarAtletas(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				return;
			}
		}
	}

	public void mostrarTime() {
		for (int i = 0; i <atletas.length; i++) {
			System.out.println(atletas[i].getNome());
		}
	}
}
