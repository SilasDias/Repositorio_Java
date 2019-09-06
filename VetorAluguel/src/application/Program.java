package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Busy;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Busy[] vect = new Busy[9];
		 
		int room = 0;
		for(int i=0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d%n", i+1);
			System.out.printf("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.printf("Email: ");
			String mail = sc.next();
			System.out.printf("Room: ");
			room = sc.nextInt();
			vect[room] = new Busy(name,mail,room);
		}
		System.out.println("Busy rooms: ");
		for(int i=0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
