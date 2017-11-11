package com.bmpl.javabasic;

public class Demo1 {

	//states
	//instance variables
	//instance variable are declared outside the methods or constructor or block
	//we can call them global variable as well
	//instance or global variable --> have a default value
	
	//variable which are declared with static keywords are static variables
	//static variable also have a default value acc. to datatype
	static int value;//static --> per class
	int value1;// non-static or instance variable --> per object
	
	
	//methods
	void input(){
		value++;
		System.out.println(value);
		value1++;
		System.out.println(value1);
	}
	
	
	//static 
	public static void main(String[] args) {
		
		//Local variable
		//variables declared inside any methods or constructor or block
		// no default is provided for local variables
		//int value = 90;
		
		Demo1 obj1 = new Demo1();
		Demo1 obj2 = new Demo1();
		Demo1 obj3 = new Demo1();
		
		obj1.input();
		obj2.input();
		obj3.input();
		
//		System.out.println(value + 43);
//		
//		System.out.println(obj1.value1 + 43.87f);
	}

}
