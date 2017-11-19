package com.bmpl.array;

public class SumArray {

	public static void main(String[] args) {
		
		int sum = 0;
		Integer values[] = {24, 34, 64, 14};
		
		Integer newValues[] = new Integer[values.length];
		
		for(int i = 0; i<values.length; i++){
			newValues[i] = values[i];
		}
		
		for(int i = newValues.length - 1; i>=0; i--){
			System.out.println("Original array values[" + i + "] = " 
					+ values[i] + "  New array values[" + i + "] = " 
					+ newValues[i]);
		}
		
		
//		for(int i : values){
//			//sum = sum + i;
//		}
		
//		for(int i= 0; i< values.length; i++){
//			sum = sum + values[i];
//		}
		
		//System.out.println("Total sum  = "+sum);

	}

}
