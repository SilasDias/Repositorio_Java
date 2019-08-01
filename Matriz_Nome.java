package application;

import java.util.ArrayList;
import java.util.Scanner;


public class Matriz_Nome {

	public static void main(String[] args) {
		
		ArrayList<String> LISTA = new ArrayList<String>();				
	    Scanner sc1 = new Scanner(System.in);
	    int t;
	    String n;
	       
	    //Entrada dos nomes
	    
	    System.out.println();
	    System.out.print("Quantos nomes a entrar: ");
	    t = sc1.nextInt();
	    
	    System.out.println();
	    for(int i = 0; i < t; i++){
	        System.out.printf("Entre com %.3d nome: ", i + 1);
	        n = sc1.nextLine();
	        LISTA.add(n);        
	    }
	    //Apresentacao dos nomes
	    
	    System.out.println();
	    for(int i = 0; i < LISTA.size(); i++){
	        n = (String) LISTA.get(i);
	        System.out.printf("%.3d nome = %s%n", i + 1, n);
	    } 
	    
	    sc1.close();

	}

}
