/*Elaborar um programa que leia um valor numérico inteiro e apresente esse valor caso seja este divisível por 4 e 5. Não sendo divisível por 4 e 5, o programa deve apresentar a mensagem “Valor não é divisível por 4 e 5”.*/

import java.io.*;
import java.util.Scanner;

class If_Divisao {
    public static void main(String args[]){
    
    int n, r4, r5;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Entre um valor numerico natural: ");
    n = s.nextInt();
    
    r4 = n % 4;
    r5 = n % 5;
    
    if (r4 == 0  || r5 == 0){
    System.out.println(n);
    }
    else {
    System.out.println("Valor nao divisivel por 4 e 5.");
    }
  }
}



