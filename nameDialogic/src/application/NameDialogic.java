package application;

import javax.swing.JOptionPane;

public class NameDialogic {

	public static void main(String[] args) {
		
		// pede para o usuário inserir seu nome
		String name = JOptionPane.showInputDialog("What is your name?");
		
		// cria a mensagem
		String message = String.format("Welcom, %s to Java Programing", name);
		
		// exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, message);
	}

}
