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
		
		int a=5;
		
		for (int b=1; b<=a; b++)
		{ 
		     for (int c=1; c<=b; c++) 
			 {
			   System.out.printf(c+" ");	 
			 }
		  System.out.println();
	    }
		
		for (int d=a-1; a>=1;a--)
		{
			for(int e = 1; e<=a; e++) 
			{
				System.out.printf(e+" ");
			}
		  System.out.println();
		}
		
		
	    }
		
		
	}

