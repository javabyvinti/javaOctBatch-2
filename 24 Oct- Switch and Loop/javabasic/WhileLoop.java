package com.bmpl.javabasic;
//Loop --> repeat 
// initilization, condition, increment or decrement

import java.util.Scanner;

//while , do-while and for 

public class WhileLoop {

	//While --> Entry controlled loop
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int val = scanner.nextInt();
		int i = 1;
		
		while(i<=10){	
			System.out.println(val + " X " + i + " = " + (val*i));
			i++;
			//val = val + 1;
		}
			
		// user input = 7
		// table of 7
		// 7 X 1 = 7
		// 7 X 10 = 70
		
		//exit
		
	}

}
