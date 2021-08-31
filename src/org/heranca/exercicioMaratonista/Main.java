package org.heranca.exercicioMaratonista;

public class Main {

	public static void main(String[] args) {
		AtletaAmador aa = new AtletaAmador("Fulano", "F", 25, 1.55, false);
		AtletaProfissional ap = new AtletaProfissional("Ciclano", " M", 28, 1.70, 55);
		AtletaAmador aa2 = new AtletaAmador("Maria", "F", 17, 1.50, true);

		System.out.println(aa);
		aa.verificarSituacao();

		System.out.println(aa2);
		aa2.verificarSituacao();

		System.out.println(ap);
		ap.verificarSituacao();
	}

}
