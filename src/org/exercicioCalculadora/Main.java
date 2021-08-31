package org.exercicioCalculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		String menu = "\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n";
		double resultado = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite qual opção você deseja: " + menu);
		int opcao = sc.nextInt();
		if (opcao < 5) {
			System.out.println("Digite um número: ");
			double a = sc.nextDouble();
			System.out.println("Digite outro número: ");
			double b = sc.nextDouble();

			resultado = calc.calcular(opcao, a, b);

			System.out.println("Resultado é: " + resultado);
		}

		sc.close();

	}

}
