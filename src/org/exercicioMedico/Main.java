package org.exercicioMedico;

public class Main {

	public static void main(String[] args) {
		Medico m1= new Medico(12345,"Ana Maria",0,250);
		Medico m2= new Medico(6789,"Antonio",0,300);
		
		m1.pagarDinheiro();
		m2.pagarDinheiro();
		m1.pagarPlano();
		m2.pagarPlano();
		
		System.out.println(m1.getnome()+" "+m1.getsalario());
		System.out.println(m2.getnome()+" "+m2.getsalario()+"\n\n");
		
		System.out.println("Total Medicos: " + Medico.getTotalMedicos());

	}

}
