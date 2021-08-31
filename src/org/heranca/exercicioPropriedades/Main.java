package org.heranca.exercicioPropriedades;

public class Main {

	public static void main(String[] args) {
		Imovel c1 = new Casa("Nova Friburgo", 50000, false);
		Imovel ap1 = new Apartamento("Olaria", 80000, 3);
		Proprietario p1 = new Proprietario("Fulano", ap1);
		Proprietario p2 = new Proprietario("Ciclano", c1);

		System.out.printf("Propriet�rio: " + p1.getNome() + "\nIm�vel:\n " + ap1.toString() + "\n\nValor ITBI: %.2f",
				ap1.calcularImpostoRenda());
		System.out.printf("\nPropriet�rio: " + p2.getNome() + "\nIm�vel:\n " + c1.toString() + "\n\nValor ITBI: %.2f",
				c1.calcularImpostoRenda());

	}

}
