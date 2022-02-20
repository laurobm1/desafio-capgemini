package br.com.capgemini;

import javax.swing.JOptionPane;

public class QuestaoUm {
	public static void escada() {
		int qtdTamanhoEscada = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de degraus!"));
		int base = qtdTamanhoEscada; 
		String escada = "";
		int qtdasterisco = 1;
		for (int i = 1; i <= qtdTamanhoEscada; i++) {
			for (int j = 0; j <= 10; j++)
				if (j == base) {
					for (int i2 = 1; i2 <= qtdasterisco; i2++) {
						System.out.print("*");
						escada = escada.concat("*");
					}
					qtdasterisco++;
					base--;
				} else {
					System.out.print(" ");
					escada = escada.concat("  ");
				}
			escada = escada.concat("\n");
			System.out.println();
		}
		JOptionPane.showMessageDialog(null, escada);
	}
}