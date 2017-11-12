package com.bmpl.javabasic;

public class ConsDemo1 {

	int value;
	
	//constructor
	//default cons
	ConsDemo1(){	//empty constructor
					// implicitly created whenever object is created
	
		System.out.println("This is my default cons");
	}
	
	ConsDemo1(int value){
		System.out.println("this is parameterized cons " + value);
	}
	
	ConsDemo1(int value, int value1){
		System.out.println("this is parameterized cons " + value + value1);
	}
	

	ConsDemo1(float value){
		System.out.println("this is parameterized cons " + value);
	}
	
	//method
	void ConsDemo1(){
		
	}
	
	
	public static void main(String[] args) {
		
		ConsDemo1 consDemo1 = new ConsDemo1(54.7f);
		//System.out.println(consDemo1.value);
	}

}
