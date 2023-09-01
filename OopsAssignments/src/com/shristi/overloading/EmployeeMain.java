package com.shristi.overloading;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		String name = sc.next();
		System.out.println("Enter the designation: ");
		String designation = sc.next();

		Employee employee = new Employee(name, designation);

		if (designation.equals("Programmer")) {
			double ProgrammerBonus = employee.calcBonus(1000);
			System.out.println("Employee Name: " + name);
			System.out.println("Programmer Bonus: " + ProgrammerBonus);

		}
		Employee employee2 = new Employee(name, designation);

		if (designation.equals("Manager")) {

			double ManagerBonus = employee2.calcBonus(1000, 500);
			System.out.println("Employee Name: " + name);
			System.out.println("Manager Bonus: " + ManagerBonus);

		}

		Employee employee3 = new Employee(name, designation);

		if (designation.equals("Director")) {
			double directorBonus = employee3.calcBonus(1000, 500, 1000);
			System.out.println("Employee Name: " + name);
			System.out.println("Director Bonus: " + directorBonus);

		}

		else {
			System.out.println("No Bonus");
		}

		sc.close();

	}
}
