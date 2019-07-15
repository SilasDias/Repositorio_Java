package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BancoConta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BancoConta bancoConta;
		
		//Adicionando os dados
		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposite = sc.nextFloat();
			bancoConta = new BancoConta(conta, name, deposite);
		}
		else {
			bancoConta = new BancoConta(conta, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(bancoConta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double addDeposite = sc.nextFloat();
		bancoConta.addDeposite(addDeposite);
		System.out.println("Updated account data:");
		System.out.println(bancoConta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double removeDeposite = sc.nextDouble();
		bancoConta.removedeposite(removeDeposite);
		System.out.println("Updated account data:");
		System.out.println(bancoConta);
		
		sc.close();
	}

}
