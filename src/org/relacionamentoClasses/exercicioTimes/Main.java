package org.relacionamentoClasses.exercicioTimes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamTime = 0;
		int i = 0;

		Time time = new Time(new Atleta[tamTime]);
		System.out.println("Digite o número de jogadores que deseja no time ");
		tamTime = sc.nextInt();

		while (i < tamTime) {
			String nome;
			int idade;
			String posicao;

			System.out.println("Digite nome do jogador: ");
			nome = sc.next();
			System.out.println("Digite a idade do jogador: ");
			idade = sc.nextInt();
			System.out.println("Digite a posicao do jogador: ");
			posicao = sc.next();
			Atleta atleta = new Atleta(nome, idade, posicao);
			time.adicionarAtletas(atleta);
			i++;
		}

		time.mostrarTime();
		sc.close();

	}

}
