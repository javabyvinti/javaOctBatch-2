package com.bmpl.array;

public class Matrix {

	public static void main(String[] args) {
		//2 * 2 = 4 elements
		Integer matrix[][]  = {{1,2}, {3,4}};
		Integer matrix1[][] = {{5,6}, {7,8}};
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				System.out.print((matrix[i][j] + matrix1[i][j]));	//  00  01     
				System.out.print("  ");	//tab space 10  11
			}
			System.out.println();
		}
		
		
//		for(int i = 0; i < 2; i++){
//			for(int j = 0; j < 2; j++){
//				System.out.print(matrix[j][i]);	//  00  01     
//				System.out.print("  ");	//tab space 10  11
//			}
//			System.out.println();
//		}
		
	}

}
