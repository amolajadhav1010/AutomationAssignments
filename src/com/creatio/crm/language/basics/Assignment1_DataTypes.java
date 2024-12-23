package com.creatio.crm.language.basics;

public class Assignment1_DataTypes {

	public static void main(String[] args) 
	{
		/**
		 * This method is a main method which will going to execute the executable statements.
		 * @param Below are the variables initialized to store its values.
		 * @author AmolJadhav Email: amol1010.jadhav@gmail.com
		 */
		 
		// Variables declaration and initialization. 
		float celsius = 25.5f, money = 1000.50f;
		boolean Yes = true, No = false;
		char ch = '"';
		double latitude = 37.7749, longitude = -122.4194, rating = 7.5, distance = 200.5;
		int year = 2023, employees = 500;
		
		// To print temperature in degree celsius.
		/**
		 * @param The below line of code contains a variable called "celsius" with float data type 
		 * and it holds temperature value.
		 */
		System.out.printf("1. Temperature of a city in degrees Celsius: %.1f", celsius);
		System.out.println();
		
		
		// To print if customer has placed order is true or false.
		/**
		 * @param The below line of code contains a boolean variable representing "Yes" and "No".  
		 */
		System.out.printf("2. Whether a customer has placed an order: %b or %b.%n", Yes, No);
		
		
		// To print person's phone number.
		/**
		 * @param The below line of code contains a String data type representing "phone number".  
		 */
		String phone = new String("123-456-7890");
		System.out.printf("3. Person's phone number: "+ ch + "%s" + ch,phone); 
		System.out.println();
		
		
		// To print the money of a customer in the bank account.
		/**
		 * @param The below line of code contains a float variable "money" which holds the amount value.  
		 */
		System.out.printf("4. Amount of money in a customer's bank account: %.2f",money);
		System.out.println();
		
		
		// To print email address of a person.
		/**
		 * @param The below line of code contains a String data type representing "email address".  
		 */
		String email = new String ("john.doe@example.com");
		System.out.printf("5. Person's email address: "+ ch + "%s" + ch, email);
		System.out.println();
		
		
		// To print the latitude and longitude of a location.
		/**
		 * @param The below line of code contains double data type of variables for latitude & longitude.  
		 */
		System.out.printf("6. Coordinates of a location (latitude, longitude): %.4f, %.4f", latitude,longitude);
		System.out.println();
		
		
		// To print the marital status of a person.
		/**
		 * @param The below line of code contains a boolean variable representing "Yes" and "No".  
		 */		
		System.out.printf("7. Person's marital status: %b or %b.%n", Yes, No);
		
		
		// To print the occupation of a person.
		/**
		 * @param The below line of code contains a String data type representing "marital status".  
		 */
		String occupation = new String ("Software Engineer");
		System.out.printf("8. Person's occupation: "+ ch + "%s" + ch, occupation);
		System.out.println();
		
		
		// To print favourite colour of a person.
		/**
		 * @param The below line of code contains a String data type representing "colour".  
		 */
		String colour = new String ("Blue");
		System.out.printf("9. Person's favourite colour: "+ ch + "%s" + ch, colour);
		System.out.println();
		
		
		// To print current year.
		/**
		 * @param The below line of code contains integer data type of variables for year.  
		 */
		System.out.printf("10. Current year: %d", year);
		System.out.println();
		
		
		// To print number of followers on social media.
		/**
		 * @param The below line of code contains a String data type representing "followers".  
		 */
		String followers = new String ("1,000,000");
		System.out.printf("11. Number of followers on a social media platform: %s", followers); 
		System.out.println();
		
		
		// To print movie ratings.
		/**
		 * @param The below line of code contains double data type of variables for ratings.  
		 */
		System.out.printf("12. Rating of a movie: %.1f", rating);
		System.out.println();
		
		
		// To print blood type of a person.
		/**
		 * @param The below line of code contains a String data type representing "blood type".  
		 */
		String bloodtype = new String ("'A'");
		System.out.printf("13. Person's blood type: %s",bloodtype);
		System.out.println();
		
		
		// To print title of a book.
		/**
		 * @param The below line of code contains a String data type representing title of a book.  
		 */
		String title = new String("To Kill a Mockingbird");
		System.out.printf("14. Title of a book: "+ ch + "%s" + ch,title);
		System.out.println();
		
		
		// To print number of employees in a company.
		/**
		 * @param The below line of code contains integer data type of variables for employees.  
		 */
		System.out.printf("15. Number of employees in a company: %d", employees);
		System.out.println();
		
		
		// To print time of a event.
		/**
		 * @param The below line of code contains a String data type representing time.  
		 */
		String event = new String("2:30 PM");
		System.out.printf("16. Time of an event: %s",event);
		System.out.println();
		
		
		// To print name of a country.
		/**
		 * @param The below line of code contains a String data type representing country.  
		 */
		String country = new String("United States");
		System.out.printf("17. Name of a country: "+ ch + "%s" + ch,country);
		System.out.println();
		
		
		// To print colour of an eye of a person.
		/**
		 * @param The below line of code contains a String data type representing eye colour.  
		 */
		String eyecolor = new String("Brown");
		System.out.printf("18. Person's eye color: "+ ch + "%s" + ch,eyecolor);
		System.out.println();
		
		
		// To print birthplace of a person.
		/**
		 * @param The below line of code contains a String data type representing birthplace.  
		 */
		String birthplace = new String("New York City");
		System.out.printf("19. Person's birthplace: "+ ch + "%s" + ch,birthplace);
		System.out.println();
		
		
		// To print distance between two cities.
		/**
		 * @param The below line of code contains double data type of variables for distance between two cities.  
		 */
		System.out.printf("20. Distance between two cities: %.1f", distance);
		System.out.println();
		

	}

}
