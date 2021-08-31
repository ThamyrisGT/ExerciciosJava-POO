package org.exercicioProduto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Scanner sc = new Scanner(System.in);
		String resposta;
	
		do {
			System.out.println("Digite o produto: ");
			p1.setDescricao(sc.next());

			System.out.println("Digite a quantidade: ");
			p1.setQuantidade(sc.nextInt());

			System.out.println("Digite o valor: ");
			p1.setValor(sc.nextDouble());

			p1.calcularIcms();
			System.out.println(" O valor de Icms é de: "+p1.calcularIcms());

			System.out.println("Deseja encerrar o programa?  Sim ou Não ");
			resposta = sc.next();

		} while (resposta.equalsIgnoreCase("Nao"));
		sc.close();

	}

}
