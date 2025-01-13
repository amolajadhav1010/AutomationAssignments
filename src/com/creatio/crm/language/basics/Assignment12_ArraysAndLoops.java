package com.creatio.crm.language.basics;

public class Assignment12_ArraysAndLoops 
{

	public static void main(String[] args) 
	{
		/**
		 * Print the numbers in diamond-shaped pyramid of numbers.
		   Pattern should be as below.

					1
				   1 2
				  1 2 3
                 1 2 3 4
                1 2 3 4 5
                 1 2 3 4
                  1 2 3
                   1 2
                    1
		 */
		
		int n=5;
		//Top half diamond
		for (int i=1; i<=n; i++)
		{ 
		//Print leading spaces
		     for (int j=i; j<n; j++) 
			 {
			   System.out.print(" ");
			 }
		  
		//Print numbers
		for (int j=1; j<=i; j++)
		{
			System.out.print(j+" ");
		}
		  System.out.println();
		}
		
		//Bottom half diamond
		for (int i = n-1; i >=1; i--) 
		{
		 for(int j=n; j>i; j--)
		 {
			 System.out.print(" ");
		 }
		 
		//Print numbers 
		for(int j=1; j<=i; j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		
	    }
		
	}
}
