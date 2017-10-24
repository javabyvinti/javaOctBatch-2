package com.bmpl.javabasic;

public class ForLoop {

	public static void main(String[] args) {
		
		int i = 10;
		
		for(int val = 1; val<=10; val++)
		{
			for(; i>=1; i--)
			{
				if(i == 5){
					continue;
					//break;
				}else{
					System.out.println(i);	
				}
				
			}
			System.out.println(val);
		}
		//System.out.println("i is = " + i);
	}

}
