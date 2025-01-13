package com.creatio.crm.language.basics;

import java.util.LinkedList;
import java.util.List;

public class Assignment_8_GroceryList 
{
	//Method to add item in the grocery list
	public void groceryList()
	{
		
		List<String> groceryList = new LinkedList<String>();
		//Map<Integer,String > groceryList = new HashMap<Integer, String>();
		groceryList.add("Coffee");
		groceryList.add("Sugar");
		groceryList.add("Nuts");
		groceryList.add("Milk");
		groceryList.add("Cheese");
		System.out.println(groceryList);
	
	}
	public void addItem()
	{
		groceryList.add("Peanuts");
	}
	public void removeItem()
	{
		groceryList.remove("Peanuts");
	}
	public void viewList()
	{
		System.out.println("**********GroceryViewList**********");
		System.out.println(groceryList);
	}
	
}

	
	
	
	
