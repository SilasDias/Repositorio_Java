/*Elaborar um programa que efetue a leitura de um valor numérico inteiro referente aos códigos 1,2 ou 3 e apresente o valor do código por extenso. Qualquer outro valor deve apresentar a mensagem “Código inválido”.*/

import java.io.*;
import java.util.Scanner;

class If_Else_Ou {
    public static void main(String args[]) {
    
    int codigo;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Entre o codigo de acesso: ");
    codigo = s.nextInt();
    
    if (codigo == 1 && codigo == 2 && codigo == 3) {
        if (codigo == 1) {
            System.out.println("Um");
        }
            if (codigo == 2) {
                System.out.println("Dois");
            }
                if (codigo == 3) {
                System.out.println("Três");
                }
     }
     else {
     System.out.println("Codigo invalido");
     }
   }
}



