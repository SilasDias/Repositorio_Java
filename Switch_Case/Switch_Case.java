/*Elaborar um programa que solicite a entrada de um valor numérico inteiro entre 1 e 12 e apresente o nome do mês por extenso.*/

import java.io.*;
import java.util.Scanner;

class Switch_Case{
    public static void main(String args[]){
    
    int mes;
    Scanner s = new Scanner(System.in);
    
    //System.out.println();
    System.out.println("Entre um valor referente a um MES: ");
    mes = s.nextInt();
    //System.out.println();
    
    switch (mes){
    case 1: System.out.println("Janeiro"); break;
    case 2: System.out.println("Fevereiro"); break;
    case 3: System.out.println("Março"); break;
    case 4: System.out.println("Abril"); break;
    case 5: System.out.println("Maio"); break;
    case 6: System.out.println("Junho"); break;
    case 7: System.out.println("Julho"); break;
    case 8: System.out.println("Agosto"); break;
    case 9: System.out.println("Setembro"); break;
    case 10: System.out.println("Outubro"); break;
    case 11: System.out.println("Novembro"); break;
    case 12: System.out.println("Dezembro"); break;
    default: System.out.println("Mes invalido"); break;
    }
    System.out.println();
  }
}

