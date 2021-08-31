package org.abstrata.exercicioFuncionarios;

public class Main {

	public static void main(String[] args) {
		Assistente a = new Assistente("Fulano",950.,100.);
		Gerente g = new Gerente("Ciclano",5000.,"Pleno");
		Diretor d = new Diretor("Beltrano",1000.,"Administrativo");
		
		a.aumentarSalario();
		g.aumentarSalario();
		d.aumentarSalario();
		
		System.out.println(a.toString());
		System.out.println(g.toString());
		System.out.println(d.toString());

	}

}
