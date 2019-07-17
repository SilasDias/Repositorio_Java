import java.util.Locale;
import java.util.Scanner;

class Ler_Imprimi{
    public static void main(String[] args){
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your full name:");
    String nome = sc.nextLine();
    System.out.println("How many bedrooms are there  in your  house");
    int quartos = sc.nextInt();
    System.out.println("Enter product price:");
    double preco = sc.nextDouble();
    System.out.println("Enter your last name, age anf height (same line):");
    String frase = sc.next();
    int idade = sc.nextInt();
    double altura = sc.nextDouble();
    
    System.out.println(nome);
    System.out.println(quartos);
    System.out.printf("%.2f%n",preco);
    System.out.println(frase);
    System.out.println(idade);
    System.out.printf("%.2f%n",altura);
    
    sc.close();
  }
}

