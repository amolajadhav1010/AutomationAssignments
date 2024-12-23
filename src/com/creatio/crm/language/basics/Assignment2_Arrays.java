package com.creatio.crm.language.basics;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		
		/**
		 * @author "Amol Jadhav" amol1010.jadhav@gmail.com
		 * Below are the initialized categories and sub categories
		 */
         
        String[] Categories = {"Groceries", "Electronics"};        
        String[] Subcategories = {"Beverages", "Snacks", "Dairy Products", "Produce"};
		
        // Create 3D array to store products
        String[][][] Products = new String[2][4][5];

        // Code for Category 1: Groceries
        /**
         * Array for Beverages Subcategory Products
         */
        Products[0][0][0] = "Cola";
        Products[0][0][1] = "Orange Juice";
        Products[0][0][2] = "Lemonade";
        Products[0][0][3] = "Green Tea";
        Products[0][0][4] = "Black Coffee";

        /**
         * Array for Snacks Subcategory Products
         */
        Products[0][1][0] = "Popcorn";
        Products[0][1][1] = "Trail Mix";
        Products[0][1][2] = "Beef Jerky";
        Products[0][1][3] = "Salted Nuts";
        Products[0][1][4] = "Rice Cakes";

        /**
         * Array for Dairy Subcategory Products
         */
        Products[0][2][0] = "Cottage Cheese";
        Products[0][2][1] = "Heavy Cream";
        Products[0][2][2] = "Ice Cream";
        Products[0][2][3] = "Parmesan Cheese";
        Products[0][2][4] = "Eggnog";

        /**
         * Array for Produce Subcategory
         */
        Products[0][3][0] = "Apples";
        Products[0][3][1] = "Bananas";
        Products[0][3][2] = "Carrots";
        Products[0][3][3] = "Potatoes";
        Products[0][3][4] = "Onions";
        
        
        // Code for Category 2: Electronics
        // Subcategory Beverages Products For Electronics Category 
        Products[1][0][0] = "Cola";
        Products[1][0][1] = "Orange Juice";
        Products[1][0][2] = "Lemonade";
        Products[1][0][3] = "Green Tea";
        Products[1][0][4] = "Black Coffee";

        // Subcategory Snacks Products For Electronics Category
        Products[1][1][0] = "Popcorn";
        Products[1][1][1] = "Trail Mix";
        Products[1][1][2] = "Beef Jerky";
        Products[1][1][3] = "Salted Nuts";
        Products[1][1][4] = "Rice Cakes";

        // Subcategory Dairy Products For Electronics Category
        Products[1][2][0] = "Cottage Cheese";
        Products[1][2][1] = "Heavy Cream";
        Products[1][2][2] = "Ice Cream";
        Products[1][2][3] = "Parmesan Cheese";
        Products[1][2][4] = "Eggnog";

        // Subcategory Produce For Electronics Category
        Products[1][3][0] = "Apples";
        Products[1][3][1] = "Bananas";
        Products[1][3][2] = "Carrots";
        Products[1][3][3] = "Potatoes";
        Products[1][3][4] = "Onions";

	}

}