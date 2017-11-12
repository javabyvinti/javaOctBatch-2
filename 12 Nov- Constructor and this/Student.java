package com.bmpl.javabasic;

public class Student {

	String courseName;
	long enrollmentNo;
	
	static int value;	// per class
	int value1; // per object
	
	
	void studentInput(){
		courseName = "B.Tech";
		enrollmentNo = 1993243243l;
	}
	
	void studentPrint(){
		System.out.println("Course ="+courseName);
		System.out.println("Enrollment No. ="+enrollmentNo);
	}
	
	void input(){
		value++;
		System.out.println(value);
		value1++;
		System.out.println(value1);
	}
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		Person person = new Person();
		person.personInput();
		person.personOutput();
		student1.studentInput();
		student1.studentPrint();
		
//		student1.input();
//		student2.input();
//		student3.input();
//		
	}

}
