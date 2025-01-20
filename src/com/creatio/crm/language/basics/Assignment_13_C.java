package com.creatio.crm.language.basics;

public class Assignment_13_C {

	public static void main(String[] args) {
		/**
		 * Write a program to print * in triangle pattern
			1. If I will pass int rows = 5 then it should print triangle with 5 Rows
		 		*
		 		**
		 		***
		 		****
		 		*****
		 */

		int numberOfRows = 5;
		
		// loop to print each row
		for(int i=1; i<=numberOfRows; i++)
		{
		// print stars for the current row	
		 for (int j=1; j<=i; j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
		}
		
	}
	
}


