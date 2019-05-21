/*Elaborar um programa que apresente o resultado da fatorial de um número qualquer inteiro fornecido.*/

import java.io.*;
import java.util.Scanner;

class For_Simples{
    public static void main(String args[]){
    
    long fat = 1;
    int n, i;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Entre com um valor: ");
    n = s.nextInt();
    
    i = 1;
    for(i = 1; i <= n; i++){
    fat *= i;
    }
    System.out.println("Fatorial = "+fat);
  }
}

