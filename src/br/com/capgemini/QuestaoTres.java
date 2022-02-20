package br.com.capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class QuestaoTres {

	public static void anagrama() {

		String palavra = JOptionPane.showInputDialog("Por favor, digite a palavra!");

		List<String> listaPares = new ArrayList<String>();

		for (int i = 0; i <= palavra.length(); i++) {
			for (int x = 0; x <= palavra.length(); x++) {
				if (x > i) {
					char[] subString = palavra.substring(i, x).toCharArray();
					Arrays.sort(subString);
					listaPares.add(Arrays.toString(subString));
				}
			}
		}

		List<String> listaQtdPares = new ArrayList<String>();
		for (int i = 0; i < listaPares.size(); i++) {
			for (int y = 0; y < listaPares.size(); y++) {
				if (y != i) {
					if (listaPares.get(i).equals(listaPares.get(y))) {
						int x = i;
						if (listaQtdPares.stream().noneMatch(
								anagrama -> anagrama.equals(listaPares.get(x)))) {
							listaQtdPares.add(listaPares.get(x));
						}
					}
				}
			}
		}

		if (!listaQtdPares.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"A palavra é um Anagrama que contém " + listaQtdPares.size() + " pares");
		} else {
			JOptionPane.showMessageDialog(null, "A palavra não é um Anagrama");
		}

	}
}