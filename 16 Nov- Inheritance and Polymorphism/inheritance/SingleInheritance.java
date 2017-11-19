package com.bmpl.inheritance;

class Person{
	
	String name;
	String address;
	long phn;
	
	void personInput(){
		System.out.println("Some Input Work is done here");
	}
	
	void personOutput(){
		System.out.println("Some Output work is done here");
	}
	
}

class Student extends Person{
	
	String courseName;
	int rollno;
	
	void studentInput(){
		personInput();
		name = "Ram Kumar";
		address = "Delhi";
		phn = 984346565l;
		courseName = "B.Tech";
		rollno = 122143434;
		System.out.println("Some input work here for student class");
	}
	
	void studentOutput(){
		personOutput();
		System.out.println("Name is = " + name);
		System.out.println("Address is = " + address);
		System.out.println("Phn is = " + phn);
		System.out.println("Course Name is = " + courseName);
		System.out.println("Rollno is = " + rollno);
		System.out.println("Some output work here for student class");
	}
}

class Employee extends Student{
	int empCode;
	int empSalary;
	
	void empInput(){
		empCode = 1001;
		empSalary = 30000;
	}
	
	void empOutput(){
		System.out.println("Emp code = " +empCode);
		System.out.println("Emp salary = " +empSalary);
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		Employee ram = new Employee();
		//ram.personInput();
		//ram.personOutput();
		ram.empInput();
		ram.empOutput();
		ram.studentInput();
		ram.studentOutput();

	}

}
