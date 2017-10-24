package com.bmpl.javabasic;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//character --> vowel or consonant
		System.out.println("Enter a character");
		
		char userChoice = scanner.next().charAt(0);
		
//		if(userChoice=='a' || userChoice == 'e' || userChoice =='o'
//				|| userChoice =='o' || userChoice == 'u' ){
//			System.out.println("Vowel");
//		} else{
//			System.out.println("Consonant");
//		}
		
		switch(userChoice){
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			
			System.out.println("Vowel");
			break;
		
		default:
			System.out.println("Consonant");
			
		}

	}

}
