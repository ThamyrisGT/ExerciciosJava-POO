package org.enums.exercicioOficinas;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Proprietario p1= new Proprietario("Fulano");
		Proprietario p2= new Proprietario("Ciclano");
		Veiculo c1= new Carro("Gol", LocalDate.of(2020,8,8), p1, "Esportivo");
		Veiculo m1= new Moto("Corsa", LocalDate.now(), p2, 6);
		
		m1.trocarOleo();
		m1.revisao();
		c1.lavarVeiculo();
		c1.trocarOleo();
		
		System.out.println(p1.toString()+" e o valor cobrado é "+c1.getValorCobrado());
		System.out.println(p2.toString()+" e o valor cobrado é "+m1.getValorCobrado());

	}

}
