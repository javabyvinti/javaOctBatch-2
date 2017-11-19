package com.bmpl.inheritance;

class A{
	
	int value = 10;
	
	A(){}
	A(int value){
		System.out.println("Param cons "+value);
	}
	
}


class B extends A{
	
	int value = 20;
	
	B(){
		//super(5);//overload constructor
		super(5);
		System.out.println("B class default cons");
	}
	
	void input(){
		System.out.println("input of B");
	}
	
	void print(int value){
		value = this.value + super.value;
		System.out.println("Value is = "+value);
	}
	
}

class C extends B{
	int value = 30;
	
	void data(int value){
		value = this.value + super.value;
	}
	
	void print(int value){
		super.print(5);
		super.input();
	}
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		
		B b = new B();
		b.print(b.value);
	}
}