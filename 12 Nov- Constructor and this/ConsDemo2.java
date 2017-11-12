package com.bmpl.javabasic;

//constructor chaining
// this keyword --> represent or point to the current class
// this -->instance variables, methods , constructors--> cons chaining

public class ConsDemo2 {

	String name ;
	int rollno;
	String collegeName;
	float percent;
	
	//default cons --> 
	ConsDemo2(){
		collegeName = "HMR/BPIT";	
	}
	
	ConsDemo2(String n, int r){
		
		//this(54.76f);	// this is constructor calling
		name = n;
		rollno = r;
	}
	
	ConsDemo2(float percentage){
		this();	//must be first statment 
		percent = percentage;
	}
	
	void input(){

	}
	
	void print(){
		System.out.println("Name is = " +name);
		System.out.println("Rollno is = "+rollno);
		System.out.println("College is = " +collegeName);
		System.out.println("Percentage is = "+percent);
	}
	
	public static void main(String[] args) {
		ConsDemo2 consDemo2 = new ConsDemo2("Ram Kumar", 1001);
		consDemo2.print();

	}

}
