package com.bmpl.array;
import java.util.Scanner;

public class ArrayJava {
//Collection of elements --> index by default --0 to end of index
	
	
	public static void main(String[] args) {
	
		//String array[] ;
		Integer marks[] = new Integer[3];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your marks");
		
		for(int i = 0; i < marks.length; i++){
			marks[i] = scanner.nextInt();
		}
		
//		for(String a : array){
//			System.out.println(a);
//		}
		
		for(int m : marks){
			System.out.println(m);
		}
		
	}

}
