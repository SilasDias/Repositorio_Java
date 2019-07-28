package application;

import java.util.Scanner;

import entities.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		// cria um projeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		//exibe o valor inicial do nome (null)
		System.out.printf("Initial name is: %s%n%n", Account.getName());
		
		//solicita e le o nome
		System.out.printf("Please enter the name: ");
		String theName = input.nextLine(); //lê jum alinha de texto 
		Account.setName(theName); //insere theName em myAccount 
		System.out.println(); 
		
		//exibe o nome armazenado no objeto myAccount
		System.out.printf("Name in object myAccount is: %s%n%n", Account.getName());
		
	input.close();	
	}
}

