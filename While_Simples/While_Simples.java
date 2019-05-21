/*Elaborar um programa que apresente o resultado da fatorial de um número qualquer inteiro fornecido.*/

import java.io.*;
import java.util.Scanner;

class While_Simples{
    public static void main(String args[]){
    
    long fat = 1;
    int n, i;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Entre com um valor: ");
    n = s.nextInt();
    
    i = 1;
    while (i <= n){
    fat = fat * i;
    i = i + 1;
    }
    System.out.println("Fatorial = "+fat);
   }
}

