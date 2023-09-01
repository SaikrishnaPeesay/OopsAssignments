package com.objects.basics;

public class Student {
	String name;
	String department;
	
	
//	public Student(String name, String department) {
//		super();
//		this.name = name;
//		this.department = department;
//	}


	void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("department: "+department);
	};
	String getGrades(int...marks) {
		int sum=0;
		int avg=0;
		for (int mark : marks) {
			sum+=mark;
		}
		avg=sum/marks.length;
		if(avg>90 && avg<=100) {
			return "A";
		}
		else if(avg>80 && avg<=90) {
			return "B";
		}
		else if(avg>70 && avg<=80) {
			return "C";
		}
		else if(avg>=60 && avg<=70) {
			return "D";
		}
		else if(avg>50 && avg<=59) {
			return "E";
		}
		return "fail";
	}

}
