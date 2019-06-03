/* Ler varios tipos de variaveis*/

import java.util.Locale;
import java.util.Scanner;

class Checklist_Variaveis{
    public static void main(String[] args){
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int n1 = sc.nextInt();
    sc.nextLine();
    
    String name = sc.nextLine();
    
    char gender = sc.next().charAt(0); // Pega como tipo char caracter na posição "0"
    
    //Codigo com letra e digito "b5"
    String s = sc.next(); // Ler tudo como uma String
    char letter = s.charAt(0); // Pega o primeiro caracter da string acima. No caso a letra "b"
    int digit = Integer.parseInt(s.substring(1)); //Recorta a string s apartir do primeiro item da string no caso o "5"
    
    // Numero double 4.32 saida com "." e não com virgula.
    //Locale.setDefault(Locale.US); // no caso não pode usado aqui e sim antes da variavel scanner
    double n2 = sc.nextDouble();
    
    //Imprimir em linhas separadas string "Maria F 23 1.68"
    String name2 = sc.next();
    char ch = sc.next().charAt(0);
    int age = sc.nextInt();
    double height = sc.nextDouble();
    
    System.out.println();
    System.out.println(n1);
    System.out.println(name);
    System.out.println(gender);
    System.out.println(letter);
    System.out.println(digit);
    System.out.println(n2);
    System.out.println(name2);
    System.out.println(ch);
    System.out.println(age);
    System.out.println(height);
        
    sc.close();  
  }
}
    
    
