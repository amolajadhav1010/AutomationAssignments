package com.creatio.crm.language.basics;

public class Assignment_8_GroceryTest {

	public static void main(String[] args) 
	{
		/**
		 * Calling the appropriate methods the interact wit the grocery list from grocery list class
		 */

		Assignment_8_GroceryList obj = new Assignment_8_GroceryList();
		System.out.println("Grocery Test class calling the methods from Grocery List class");
		obj.groceryList(); // Grocery list.
		obj.addItem(); //To add an item in grocery list.
		obj.removeItem(); //To remove an item from grocery list.
		obj.viewList(); //To view all the items from grocery list.
	}

}
