/*Elaborar um programa que efetue a leitura de três valores inteiros representados pelas variáveis A, B e C. O programa deve executar a operação X = (A + B) * C se o valor da variável C não for maior que 5, caso contrário deverá ser feita a operação X = (A - B) * C. Qualquer que seja a operação efetuada o programa deve apresentar o valor obtido junto a variável X.*/

import java.io.*;
import java.util.Scanner;

class If_Negacao{
    public static void main(String args[]){
    
    int a,b,c,x;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Entre com o valor <A>:");
    a = s.nextInt();
    
    System.out.println("Entre com o valor <B>:");
    b = s.nextInt();
    
    System.out.println("Entre com o valor <C>:");
    c = s.nextInt();
    
    if (!(c>5)){
    x = (a+b)*c;
    }
    else {
    x = (a-b)*c;
    }
    System.out.println("O resultado de X equivale a: " + x);
  }
}
    
    
    
    
    
    
    
    
    
    
    
    




