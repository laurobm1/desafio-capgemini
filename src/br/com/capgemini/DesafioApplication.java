package br.com.capgemini;



import javax.swing.JOptionPane;

public class DesafioApplication {

	public static void main(String[] args) {
		boolean started = true;
		while (started) {
			String opcaoSelecionada = JOptionPane
					.showInputDialog("Ola, Seja bem vindo ao Desafio de Programacao da Academia Capgemini!\n\n"
							+ "Por favor, selecione uma opcao valida!\n\n"
							+ "(1) Questao 1 - Algoritmo que mostra na tela uma escada\n\n"
							+ "(2) Questao 2 - Algoritmo para validacaoo de senha\n\n"
							+ "(3) Questao 3 - Algoritmo para verificar se um par e Anagrama\n\n" + "(4) Sair \n\n");

			switch (opcaoSelecionada) {
			case "1":
				QuestaoUm.escada();
				break;
			case "2":
				QuestaoDois.validadorSenha();
				break;
			case "3":
				QuestaoTres.anagrama();
				break;
			case "4":
				started = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Ops, Voce digitou uma opcao incorreta!");
				break;
			}
		}

	}

}
