package org.heranca.exercicioImpostoDeRenda;

public class Main {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Fulano", 10000, "12345", "6789");
		PessoaJuridica pj = new PessoaJuridica("Ciclano", 5000, "89742", "25614");

		double valorIrpf = pf.CalcularIR();
		double valorIrpj = pj.CalcularIR();

		System.out.println(pf.getNome() + "\n" +"Valor IR: "+ valorIrpf + "\n" +"CPF: "+ pf.getCpf());
		System.out.println(pj.getNome()+ "\n" +"Valor IR: "+ valorIrpj + "\n" + "CNPJ: "+pj.getCnpj());

	}

}
