package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5_ArraysAndCollections {

	public static void main(String[] args) {
		
		/**
		 * @author AmolJadhav "amol1010.jadhav@gmail.com"
		 * Assignment -5 (Arrays & Collections)
			1. Create a list of the top 5 most populated countries in the world and print 2nd Country.
			2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
			3. Create a map of the 5 largest cities in the United States and their populations.
			4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
			5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		 */
		
		
		// Add countries details and retrieve world's 2nd populated country.
		List<String> countries = new ArrayList<String>();
		countries.add("India with 1,450,935,791 people."); 			        //1,450,935,791
		countries.add("China with 1,419,321,278 people."); 					//1,419,321,278
		countries.add("United States with 345,426,571 people."); 			//345,426,571
		countries.add("Indonesia with 283,487,931 people."); 				//283,487,931
		countries.add("Pakistan with 253,158,644 people."); 				//253,158,644
		System.out.printf("1. The 2nd populated country is: %s\n", countries.get(1));
		System.out.println();
				
		
		// Add tourist attractions and retrieve respective sizes.
		Set<String> touristLinkedHashSet = new LinkedHashSet<String>();
		touristLinkedHashSet.add("The Great Pyramid of Giza");
		touristLinkedHashSet.add("The Great Wall of China");
		touristLinkedHashSet.add("The Eiffel Tower");
		touristLinkedHashSet.add("The Louvre");
		touristLinkedHashSet.add("The Statue of Liberty");
		touristLinkedHashSet.add("The Empire State Building");
		touristLinkedHashSet.add("Times Square");
		touristLinkedHashSet.add("Brooklyn Bridge");
		touristLinkedHashSet.add("The Forbidden City");
		touristLinkedHashSet.add("St. Peter's Basilica");
		System.out.println("2. Total size in LinkedHashSet is: "+touristLinkedHashSet.size());
		System.out.println(touristLinkedHashSet);
		System.out.println();

		
		//5 largest cities in the United States and their populations
		Map<Integer,String> citiesLinkedHashMap = new LinkedHashMap<Integer, String>();
		citiesLinkedHashMap.put(1,"New York City: Population 8,491,079");
		citiesLinkedHashMap.put(2,"Los Angeles: Population 3,928,864");
		citiesLinkedHashMap.put(3,"Chicago: Population 2,722,389");
		citiesLinkedHashMap.put(4,"Houston: Population 2,239,558");
		citiesLinkedHashMap.put(5,"Philadelphia: Population 1,560,297");
		System.out.println("3. The 5 largest cities in the United States and their populations are as follows:");
		System.out.println(citiesLinkedHashMap);
		System.out.println();
		
		
		// An array of 10 random integers and print out the sum of 3rd and 5th Value
		int [] random = new int [] {10,15,-20,25,30,35,40,45,50,55};
		int sum = random[2]+random[4];
		System.out.printf("4. The sum of 3rd value " + (random[2]) + " and " + "5th value " + (random[4]) + " is: %d\n", sum);
		System.out.println();
		
		
		// Top 5 highest-grossing movies of all times and print out the third movie on the list
		List<String> movies = new ArrayList<String>();
		movies.add("Titanic");
		movies.add("Avatar");
		movies.add("Avengers: Infinity War");
		movies.add("Spider-Man: No Way Home");
		movies.add("Star Wars: The Force Awakens");
		System.out.printf("5. The top 5 highest-grossing movies of all times are:");
		System.out.println(movies);
		System.out.printf("The third movie on the list is: %s",movies.get(2));
				
	}

}
