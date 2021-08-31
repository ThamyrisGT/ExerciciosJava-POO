package org.interfaces.olimpiadas;

public class Main {

	public static void main(String[] args) {
		Pais p1= new Pais("Brasil");
		Pais p2= new Pais("Portugal");
		Pais p3= new Pais("Alemanha");
		
		Atleta a1=new Atleta("Fulano", 95, p1);
		Atleta a2=new Atleta("Ciclano", 50, p2);
		Atleta a3=new Atleta("Beltrano", 70, p3);
		
		System.out.println("O atleta "+ a1.getNome()+" "+ a1.verificarSituacao());
		System.out.println("O atleta "+ a2.getNome()+" "+ a2.verificarSituacao());
		System.out.println("O atleta "+ a3.getNome()+" "+ a3.verificarSituacao());
		System.out.println("Total de participantes são: "+ Atleta.getTotalParticipantes());

	}

}
