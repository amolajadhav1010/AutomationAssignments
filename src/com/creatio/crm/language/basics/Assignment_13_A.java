package com.creatio.crm.language.basics;

public class Assignment_13_A 
{
 public static void main(String[] args) 
  {
		/**
		 * Write a program to perform the following tasks:
		1. Count the total number of words in the sentence.
		2. Print the sentence words in reverse order.
		3. Convert the first character of each word to uppercase and print original sentence
		String sentence = "Java programming is fun and challenging";
		 */
	 
	 String sentence = "Java programming is fun and challenging";
	 
	 // 1. Count the total number of words in the sentence.
	 String[] words = sentence.split(" ");
	 int wordCount = words.length;
	 System.out.println("1. Total number of words: "+wordCount);
	 
	 
	 //2. Print the sentence words in reverse order.
	 System.out.print("2. Words in reverse order: ");
	 for (int i = words.length-1; i>=0; i--)
	 {
		System.out.print(words[i]+" ");
	 }
	 	System.out.println();
	 	
	 	
	 //3. Convert the first character of each word to uppercase and print original sentence.
	 StringBuilder uppercaseSentence = new StringBuilder();
	 
	 for (String word : words)
	 {
		 uppercaseSentence.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
				 
	 }
	 System.out.println("3. Sentence with each word's first character in uppercase: " + uppercaseSentence.toString().trim());
	 
  }
}
