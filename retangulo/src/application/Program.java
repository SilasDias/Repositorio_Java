package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	private static Scanner sc;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
	
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.print("AREA: "+retangulo.area()+"\n");
		System.out.print("PERIMETER: "+retangulo.perimeter()+"\n");
		System.out.print("DIAGONAL: "+retangulo.diagonal());
		System.out.println();
		
	sc.close();
	}

}
