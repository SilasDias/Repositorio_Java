package application;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrizNome {

	public static void main(String[] args) {
		
		ArrayList<String> LISTA = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		int t;
		String n;
		
		System.out.println();
		System.out.printf("Quantos nomes para inserir: ");
		t = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i < t; i++) {
			System.out.printf("Entre com %d nome: ", i+1, "%n");
			n = sc.next();
			LISTA.add(n);			
		}
		
		System.out.println();
		for(int i = 0; i < t; i++) {
			n = LISTA.get(i);
			System.out.printf("%d nome = %s%n", i+1, n);
		}
	}

}
