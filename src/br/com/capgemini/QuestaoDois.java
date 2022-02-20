package br.com.capgemini;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class QuestaoDois {

	public static void validadorSenha() {

		String senha = JOptionPane.showInputDialog("Digite uma Senha!");

		boolean existeErro = false;

		if (senha.length() < 6) {
			existeErro = true;
		}

		boolean ehDigito = Pattern.matches("(.*)(\\d+)(.*)", senha);
		if (!ehDigito) {
			existeErro = true;
		}

		boolean ehMinusculo = senha.chars().anyMatch(x -> Character.isLowerCase(x));
		if (!ehMinusculo) {
			existeErro = true;
		}

		boolean ehMaisculo = senha.chars().anyMatch(x -> Character.isUpperCase(x));
		if (!ehMaisculo) {
			existeErro = true;
		}
	    boolean ehCaracterEspecial = Pattern.matches("(.*)([!@#$%^&*()\\-+]+)(.*)", senha);
		if (!ehCaracterEspecial) {
			existeErro = true;
		}

		if (!existeErro) {
			JOptionPane.showMessageDialog(null, "Senha digitada é válida!");
		} else {
			JOptionPane.showMessageDialog(null, "Senha digitada é inválida!");
		}

	}


}