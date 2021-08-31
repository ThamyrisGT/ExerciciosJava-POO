package org.heranca.exercicioVeiculo;

public class Main {

	public static void main(String[] args) {
		Caminhao c =new Caminhao();
		VeiculoPasseio vp = new VeiculoPasseio();
		vp.setPlaca("lvc-9889");
		vp.setQtdPortas(4);
		c.setCargaMaxima(1000);
		c.setPlaca("ABC-3454");
		
		System.out.println("Placa do carro: "+vp.getPlaca() +"\nQtd. de portas: "+vp.getQtdPortas());
		System.out.println("Placa do caminhão: "+c.getPlaca()+"\nCarga máxima de: "+ c.getCargaMaxima());
		
	}

}
