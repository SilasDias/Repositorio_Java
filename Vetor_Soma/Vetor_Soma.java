/*Elaborar um programa que receba o fornecimento de cinco valores inteiros em uma matriz de uma dimensão (tipo vetor) e apresente o somatório dos elementos ímpares fornecidos.*/

import java.io.*; 
import java.util.Scanner;

class Vetor_Soma{
    public static void main(String[] args){
    
    int a[] = new int[5];
    int i, soma = 0;
    Scanner s = new Scanner (System.in);
    
    //Entrada dos dados
    for(i=0;i<=4;i++){
        System.out.println("Entre o "+(i+1)+"o. elemento: ");
        a[i] = s.nextInt();
    }
    //Processamento par ou impar
    for(i=0;i<=4;i++){
        if(a[i] % 2 != 0){
        soma += a[i];
        }
    }
    // Apresentação dos arranjos
    
    System.out.println("Soma = "+soma);
  }
}
    

