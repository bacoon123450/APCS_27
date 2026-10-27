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
		Employee michael = new Employee();
		michael.employeeToString();
		Employee Dwight = new Employee(1987,"Dwight", "shrute", 4416.66);
		Dwight.employeeToString();
		Employee Jim = new Employee(2474,"Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		Employee Pam = new Employee(2011,"Pam", "Beesly", 2250.0);
		Pam.employeeToString();
		Employee Jessica = new Employee(6767,"Jessica", "Arbitrario", 0.08333333333333);
		Jessica.employeeToString();
		michael.raiseSalary(1200);
		Dwight.raiseSalary(1200);
		Jim.raiseSalary(1200);
		Pam.raiseSalary(1200);
		Jessica.raiseSalary(1200);
		Jessica.employeeToString();
		Pam.employeeToString();
		Jim.employeeToString();
		Dwight.employeeToString();
		michael.employeeToString();

		


		
	}
}
