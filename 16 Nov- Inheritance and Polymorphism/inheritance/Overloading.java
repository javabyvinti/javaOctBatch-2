package com.bmpl.inheritance;

public class Overloading {

	int value1  = 20, value2 = 60;
	
	void add(){
		System.out.println(value1 + value2);
	}
	
	
	void add(int value1, int value2){
		System.out.println(value1 + value2);
	}
	
	float add(int value1, float value2){
		return value1 + value2;
	}
	
	int add(int value1, int value2, int value3){
		return value1 + value2 + value3;
	}
	
	long add(long value1, long value2){
		return value1 + value2;
	}
	
	float add(float value1, int value2){
		return value1 + value2;
	}
	public static void main(String[] args) {
	
		Overloading obj = new Overloading();
		obj.add();
		System.out.println(obj.add(89.5f, 6));

	}

}
