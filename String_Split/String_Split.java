/* Dividir uma String com Split e armazenar em um Vetor*/

import java.util.*;

class String_Split{
    public static void main(String[] args){
    
    String s = "Batata Maça Limão";
    String[] vect = s.split(" ");
    
    System.out.println(vect[0]);
    System.out.println(vect[1]);
    System.out.println(vect[2]);
  }
}
