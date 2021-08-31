package org.heranca.exercicioMedicos;

public class Main {

	public static void main(String[] args) {
		Medico medico=new Medico("Clinica X", "Dr. Marcos", 1232434546);
		Anestesista anestesista=new Anestesista("Empresa Y", "Dr. Alexandre", 1232, "Peridural");
		ControlePagamento cp=new ControlePagamento();
		
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		cp.calcularTotalPago(anestesista);
		cp.calcularTotalPago(medico);
		
		System.out.println(medico.toString());
		System.out.println(anestesista.toString());
		System.out.println("O Total pago será de: " + cp.getTotalPago());

	}

}
