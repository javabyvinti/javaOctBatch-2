package com.bmpl.inheritance;

//inheritance --> final class cannot be inherited
//String--> final class
class Parent /*extends String*/{
	
	final int value = 90;
	
	final void data(){
		//value++;
	}
	
}

final class Child extends Parent{
	
	//void data(){}
}

public class FinalDemo {

	public static void main(String[] args) {
		//Parent obj = new Parent();
	}

}
