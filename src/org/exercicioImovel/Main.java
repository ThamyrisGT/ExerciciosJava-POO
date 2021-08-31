package org.exercicioImovel;

//1) Crie uma classe com o nome Imovel com os atributos e métodos abaixo:
//	   atributos: 
//	   codImovel, 
//		bairro
//		tipo
//		valor
//
//		- Construa dois objetos em uma outra classe com o nome MainImovel com os seguintes dados: 
//			1, “Centro”,”apto”,25000.
//			2,”Quitandinha”,”casa”,98900.
//
//		-Métodos 
//
//		- Crie um método para calcular o reajuste para casa 5% e para apto 8%
//		- Crie um método para mostra a categoria do imóvel:
//
//		   Categoria A - acima de 50000
//		   Categoria B - a partir de 10000 e menor que 50000
//		   Categoria C - valores inferiors a 10000


public class Main {

	public static void main(String[] args) {
		Imovel a = new Imovel();
		a.codImovel= 003;
		a.bairro= "Centro";
		a.tipo ="casa";
		a.valor=25000;
		
		System.out.println(a.bairro + "  "+ a.valor);
		a.calcularReajuste();
		System.out.println("Valor ajustado é: "+ a.valor);
		System.out.println("A categoria desse imóvel é: "+a.verificarCategoria()+"\n");
		
		Imovel b=new Imovel();
		b.codImovel= 003;
		b.bairro= "Quintandinha";
		b.tipo ="apt";
		b.valor=98900;
		
		System.out.println(b.bairro + "  "+ b.valor);
		b.calcularReajuste();
		System.out.println("Valor ajustado é: "+ b.valor);
		System.out.println("A categoria desse imóvel é: "+b.verificarCategoria()+"\n");
		

	}

}
