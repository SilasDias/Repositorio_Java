/*Elaborar um programa que apresente o resultado da fatorial de um número qualquer inteiro fornecido.*/

import java.io.*;
import java.util.Scanner;

class Do_While_Simples{
    public static void main(String args[]){
    
    long fat = 1;
    int n, i;
    Scanner s = new Scanner(System.in);
    System.out.print("Entre um valor: ");
    n = s.nextInt();
    
    i = 1;
    
    do 
    {
    fat *= i;
    i++;
    }
    while (i <= n);
    System.out.println("Fatorial = "+ fat);
  }
}


