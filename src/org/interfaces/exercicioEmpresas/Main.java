package org.interfaces.exercicioEmpresas;

public class Main {

	public static void main(String[] args) {
		
		// aplicando Polimorfismo
		
		Tributos t1 = new Pessoa ("Fulano",12000.);
		Tributos t2 = new Empresa("Empresa LTDA", 880900.);
		TotalTributos t = new TotalTributos();
		
		t.totalizarTributos(t1);
		t.totalizarTributos(t2);
		
		System.out.println("Total de tributos é: " + t.getTotal());
		
//		Pessoa p = new Pessoa ("Fulano",12000.);
//		Empresa e = new Empresa("Empresa LTDA", 880900.);
//		TotalTributos t = new TotalTributos();
//		
//		t.totalizarTributos(p);
//		t.totalizarTributos(e);
//		
//		System.out.println("Total de tributos é: " + t.getTotal());

	}

}
