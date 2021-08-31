package org.heranca.exercicioLojas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcao = 'N';
		double valorVenda;
		int opcaoVendedor;
		double totalVendido = 0;
		System.out.println("-------Sistema de Vendas---------");

		Vendedor fixo1 = new Fixo("Joao", "3242342", 200, 3);
		Vendedor fixo2 = new Fixo("Maria", "3242897897342", 300, 8);
		Vendedor freelancer = new Freelancer("José", "3242897897342", 300, 8);

		System.out.println("Vendedores:");
		System.out.println("1-" + fixo1.getNome());
		System.out.println("2-" + fixo2.getNome());
		System.out.println("3-" + freelancer.getNome());

		while (opcao == 'N') {
			System.out.println("Escolha o vendedor");
			opcaoVendedor = sc.nextInt();

			System.out.println("Qual Valor da venda");
			valorVenda = sc.nextDouble();

			if (opcaoVendedor == 1) {
				fixo1.calcularSalario(valorVenda);
			} else if (opcaoVendedor == 2) {
				fixo2.calcularSalario(valorVenda);
			} else {
				freelancer.calcularSalario(valorVenda);
			}

			totalVendido += valorVenda;
			System.out.println("deseja encerrar o programa? (S/N)");
			opcao = sc.next().charAt(0);
		}
		System.out.println("-------Salario dos vendedores:---------");
		System.out.println(fixo1.toString());
		System.out.println(fixo2.toString());
		System.out.println(freelancer.toString());

		System.out.println("-------Total vendido:---------");
		System.out.println(totalVendido);

		sc.close();

	}

}
