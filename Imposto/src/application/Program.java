package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<Contribuinte>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.printf("Tax payer #" +i+" data: %n");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double care = sc.nextDouble();
				list.add(new PessoaFisica(name, income, care));
			}
			else {
				System.out.print("Number of employees: ");
				int funcionarios = sc.nextInt();
				list.add(new PessoaJuridica(name, income, funcionarios));
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Contribuinte contr : list) {
			double tax = contr.tax();
			System.out.println(contr.getName() + ": $" + String.format("%.2f", tax));
			sum += tax;
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $"+ String.format("%.2f", sum));
		sc.close();
	}

}
