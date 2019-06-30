/* Deixar uma string inteira em minuscula */
import java.util.*;

class String_Diversos{
    public static void main(String[] args){
    
    String original = "abcde FGHIJ ABC abc DEFG  ";
    
    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();
    String s04 = original.substring(2);
    String s05 = original.substring(2,9);
    String s06 = original.replace('a','x');
    String s07= original.replace("abc","xy");
    int i = original.indexOf("bc"); //Primeira string com o conteudo
    int j = original.lastIndexOf("bc");//Ultima string com o conteudo
    
    System.out.println();
    System.out.println("Original -"+original+"-");
    System.out.println("toLowerCase -"+s01+"-");
    System.out.println("toUpperCase -"+s02+"-");
    System.out.println("Trim -"+s03+"-");
    System.out.println("Substring(2) -"+s04+"-");
    System.out.println("Substring(2,9) -"+s05+"-");
    System.out.println("Replace('a','x') -"+s06+"-");
    System.out.println("Replace('abc','xy') -"+s07+"-");
    System.out.println("Index Of 'bc':-"+i+"-");
    System.out.println("Last Index Of 'bc':-"+j+"-");
    
    System.out.println();
    
  }
}

