package org.heranca.exercicioContatos;

public class Main {

	public static void main(String[] args) {
		Estado estado = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade = new Cidade("Nova Friburgo", estado);
		Endereco endereco = new Endereco("Rua Carolina...", "Cônego", "28620000", cidade);

		Telefone tel1 = new Telefone("252221520");
		Telefone tel2 = new Telefone("224156397");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel1;
		telefones[1] = tel2;

		Contato contato = new Contato("Roberta", endereco);
		contato.setTelefone(telefones);

		System.out
				.println("Nome: " + contato.getNome() + "\nEndereço: " + contato.getEndereco().toString() + " " + "\n");
		contato.mostrarTelefones();
	}

}
