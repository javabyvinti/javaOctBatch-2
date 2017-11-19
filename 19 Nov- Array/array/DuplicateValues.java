package com.bmpl.array;

public class DuplicateValues {

	public static void main(String[] args) {
		
		Integer array[] = {54,32,65,32,54};
		
		for(int i=  0; i< array.length; i++){
			if(array[0] == array[i + 1]){	// 54 == 32
				System.out.println("Duplicate = "+ array[i]);
			}
		}

	}

}
