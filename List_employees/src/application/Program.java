package application;

import java.awt.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many employee will me be registered? ");
		int n = sc.nextInt();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		for (int i=0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Employee #%d%n", i+1);
			System.out.printf("Id ");
			int id = sc.nextInt();
			System.out.printf("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.printf("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			
			list.add(new Employee(id, name, salary));
			
		}
		
		System.out.println();
		System.out.printf("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		Employee emp = (Employee) list.stream().filter(x -> ((Employee) x).getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exists!");
		}
		else {
			System.out.printf("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employee: ");
		
		for(Employee obj : list) {
			System.out.println(obj);
		}
	}

	

}
