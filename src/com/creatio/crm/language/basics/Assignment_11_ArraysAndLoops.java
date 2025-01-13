package com.creatio.crm.language.basics;

public class Assignment_11_ArraysAndLoops {

	public static void main(String[] args) 
	{
		/**
		   Given values are 12,34,11,36,87,98,93.
		   Store the values in Array and Print second and third largest number from the above values 
		   without using collections and default sort methods.
		 */
	
		//Storing values in arrays.
		int [] arrayValues = {12,34,11,36,87,98,93};
		
		//Identifying and Initializing top three largest values in the variables for comparing with each other.
		int largest=98, secondLargest=93, thirdLargest=87;
		
		//Using "for-each" loop for iterating over the given arrayValues. 
		for (int num : arrayValues) 
		{
			if (num>largest)
		    {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = num;
		    }
			else if ((num>secondLargest) && (num!=largest))
			{
				thirdLargest = secondLargest;
				secondLargest = num;
			}
			else if ((num>thirdLargest) && (num!=largest) && (num!=secondLargest))
			{
				thirdLargest = num;
			}
		}
		//Printing the second and third largest values.
			System.out.printf("Second Largest Value: %d",+secondLargest);
			System.out.println();
			System.out.printf("Third Largest Value: %d",+thirdLargest);
	}
}