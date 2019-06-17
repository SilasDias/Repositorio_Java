package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("Uptdated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		System.out.println();
		System.out.print("Product data: "+product.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.print("Update data: "+product.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		int removed = sc.nextInt();
		product.removeProducts(removed);
		
		System.out.println();
		System.out.print("Update data: "+product.toString());
		
		
	sc.close();
	}

}
