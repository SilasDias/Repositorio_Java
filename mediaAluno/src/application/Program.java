package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = scan.nextLine();
		student.trim1 = scan.nextDouble();
		student.trim2 = scan.nextDouble();
		student.trim3 = scan.nextDouble();
		
		System.out.print("FINAL GRADE: " + student.soma()+"\n");
		
		if(student.soma() < 60.00) {
			System.out.println("FAILED");
			System.out.print("MISSING "+student.media()+" POINTS \n");
			
		}else {
			System.out.println("PASS");
		}
		
		scan.close();
	}

}
