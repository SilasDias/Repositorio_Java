package application;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

//Dentro de um metodo estático voce não pode chamar membros de instancia da mesma classe.

public class Program {

	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double cicle = circumference(radius);
		double volume = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", cicle);
		System.out.printf("Volume: %.2f%n",volume);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}

}
