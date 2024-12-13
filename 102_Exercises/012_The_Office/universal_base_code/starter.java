/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		Employee toilet = new Employee(6969, "Skibidi", "Toilet", 9999.0);
		
		dwight.raiseSalary(20);
		jim.raiseSalary(5);
		pam.raiseSalary(99);
		toilet.raiseSalary(10);
		
		
		System.out.println(dwight.getFirstName() + " " + dwight.getLastName() + ", Monthly: " + dwight.getSalary() + ", Anunual: " + dwight.getAnnualSalary());
		System.out.println("------------------");
		System.out.println(jim.getFirstName() + " " + jim.getLastName() + ", Monthly: " + jim.getSalary() + ", Anunual: " + jim.getAnnualSalary());
		System.out.println("------------------");
		System.out.println(pam.getFirstName() + " " + pam.getLastName() + ", Monthly: " + pam.getSalary() + ", Anunual: " + pam.getAnnualSalary());
		System.out.println("------------------");
		System.out.println(toilet.getFirstName() + " " + toilet.getLastName() + ", Monthly: " + toilet.getSalary() + ", Anunual: " + toilet.getAnnualSalary());
		
	}
}
