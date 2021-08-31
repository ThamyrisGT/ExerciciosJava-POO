package org.interfaces.exercicioContas;

public class Main {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca();
		Cdb cdb = new Cdb();
		ContaCorrente cc = new ContaCorrente();

		cp.depositarConta(1000);
		cdb.depositarConta(2000);
		cc.depositarConta(2500);

		cp.sacarConta(500);
		cdb.setIof(0.99);
		cdb.sacarConta(200);
		cc.setTaxa(1.3);
		cc.sacarConta(300);

		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cdb.getSaldo());

	}

}
