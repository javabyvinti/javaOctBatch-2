package com.bmpl.javabasic;

public class SwitchProblem {

	public static void main(String[] args) {
		
		int color = 2;
		
		switch(color){
		
		case 1:
			System.out.println("Red");
			
			default:
				System.out.println("Green");
				break;
			case 3: 
				System.out.println("Blue");
			case 2: 
				System.out.println("Pink");
				break;
		}

	}

}
