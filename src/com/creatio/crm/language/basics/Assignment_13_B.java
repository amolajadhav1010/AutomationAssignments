package com.creatio.crm.language.basics;

public class Assignment_13_B 
{

	public static void main(String[] args) 
	{
		
	/**
	 * Write a program to search for all occurrences of a “Java” word in the paragraph and print their indexes.
	   1. Divide into multiple words
	   2. Find total number of occurrences
	   3. Print count and Indexes of the word
	   String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
	*/

		
	String 	paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
	
	// 1. Divide into multiple words
	String [] words = paragraph.split(" ");
	System.out.print("Word in the paragraph:");
	
	for(String word: words)
	{
	System.out.print(word+" ");
	}
	System.out.println("\n");
   
	
	
	//2. Find total number of occurrences and print indexes
	String searchWord = "Java";
	int count = 0;
	System.out.print("Indexes of the word \"" + searchWord + "\": ");
	
	for (int i = 0; i<words.length; i++)
	{
		String cleanedWord = words[i].replaceAll("[^a-zA-Z]", "");
		
		if (cleanedWord.equals(searchWord)) 
		{
		System.out.print(i + " ");
		count++;
		}
	}
	System.out.println("\nTotal occurance of \"" + searchWord + "\": " + count);
 }
	
}

