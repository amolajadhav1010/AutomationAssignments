package com.creatio.crm.language.basics;

public class Assignment_6_ControlStatements {

	public static void main(String[] args) {
		
		/**
		 * A bank evaluates loan applicants based on the following criteria:
1. Credit Score:
o If the credit score is above 750, the loan is automatically approved.
o If the credit score is between 650 and 750, additional checks are performed.
o If the credit score is below 650, the loan is denied.

2. Income:
o For credit scores between 650 and 750, the customer’s income must be at least $50,000
for the loan to be considered.

3. Employment Status:
o If the customer’s income is at least 50,000, the system checks whether the customer is
employed.
o If the customer is unemployed, the loan is denied.
4. Debt-to-Income Ratio:
o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
o If the DTI ratio is less than 40%, the loan is approved.
o If the DTI ratio is 40% or greater, the loan is denied.

Now based on below details, print whether user is eligible to get the loan or not
customerName = "John Doe";
creditScore = 720;
income = 55000.0;
isEmployed = true;
debtToIncomeRatio = 35.0;
		 */
		
		//Storing user details
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;
	
		//1. Credit Score: If the credit score is above 750, the loan is automatically approved.
		
		if (creditScore>750)
		{
		System.out.println("The loan is automatically approved.");	
		}
	 //If the credit score is between 650 and 750, additional checks are performed.
		else if (creditScore>=750 && creditScore<=650 )
		{
			System.out.println("Additional checks are performed for credit score <=750 and >=650.");
			2.Income:
				the customer's income must be at least $50,000
			3.Employment Status: If the customer’s income is at least 50,000, the system checks whether the customer is
			employed.
			If the customer is unemployed, the loan is denied.
			4. Debt-to-Income Ratio: 
		}
		
	}
	
}	