/*Elaborar um programa que, com a utilização do operador de conjunção
, AND efetue a leitura de um valor numérico inteiro representado pela variável NUMERO e apresente mensagem informando se o valor está ou não entre os valores de 20 a 90. Lembre-se de que qualquer valor fornecido fora da faixa definida apresenta a mensagem “O valor não está entre 20 e 90”, caso contrário o programa deverá apresentar a mensagem “O valor está entre 20 e 90”*/

import java.io.*;
import java.util.Scanner;

class If_Else{
    public static void main(String args[]){
    
    int numero;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Entre com um valor:");
    numero = s.nextInt();
    
    if (numero >=20 && numero <= 90){
        System.out.println("Valor entre 20 e 90");
        }
        else {
        System.out.println("Valor não esta entre 20 e 90");
        }
  }
}



