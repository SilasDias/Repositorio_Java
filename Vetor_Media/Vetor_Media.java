/*Elaborar um programa que efetue o cálculo e apresente a média geral das médias individuais de uma turma de oito alunos. A média a ser obtida deve ser a média geral de cada aluno obtida durante o ano letivo.*/

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class Vetor_Media {
    public static void main(String[] args){
    
    float mdg[] = new float[8];
    float soma = 0, media;
    int i;
    
    DecimalFormat df = new DecimalFormat ("0.00");
    Scanner s = new Scanner (System.in);
    
    for(i = 0; i <= 7; i++){
        System.out.println("Media do "+ (i+1)+ "o.aluno: ");
        mdg[i] = s.nextFloat();
        soma += mdg[i];
        }
     media = soma / 8;
     System.out.println("Media geral = "+ df.format(media));
   }
}
