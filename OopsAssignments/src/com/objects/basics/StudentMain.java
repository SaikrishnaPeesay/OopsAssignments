package com.objects.basics;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Enter the name of student 1: ");
		student.name = sc.nextLine();
		
		System.out.println("Enter the Department of student 1 ");
		
		student.department = sc.next();
		int marks[]=new int[5];
		
		System.out.println("Enter the Marks of student 1");
		for (int i = 0; i < marks.length; i++) {
			marks[i]=sc.nextInt();
		}
		student.printDetails();
		String grade = student.getGrades(marks);
		System.out.println("Grade: "+grade);
		
		
		
		
		
		//student2
		Student student1 = new Student();
		System.out.println("Enter the name of student 2: ");
		student1.name = sc.next();
		
		System.out.println("Enter the Department of student 2 ");
		
		student1.department = sc.next();
		int marks1[]=new int[5];
		
		System.out.println("Enter the Marks of student 2");
		for (int i = 0; i < marks1.length; i++) {
			marks1[i]=sc.nextInt();
		}
		student1.printDetails();
		String grade1 = student1.getGrades(marks1);
		System.out.println("Grade: "+grade1);
		
	}

}
