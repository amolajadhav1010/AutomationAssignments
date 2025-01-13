package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment_6_LoopsAndConditionalStatements {

	public static void main(String[] args) {
		
		/**
		 * 1. Print total number of credit and debit transactions completed
		 * 2. Print the total amount credited and debited in account
		 * 3. Print total amount remaining at the end in Bank Account
		 * 4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
			  Transaction with Amount” and also print total number of suspicious transactions
		*/
		
		
		// Store credited amounts using ArrayList
		List<Integer> creditTransactionArrayList = new ArrayList<Integer>();
		creditTransactionArrayList.add(50000);
		creditTransactionArrayList.add(3000);
		creditTransactionArrayList.add(4000);
		
		// Store debated amounts using ArrayList
		List<Integer> debitTransactionArrayList = new ArrayList<Integer>();
		debitTransactionArrayList.add(-2000);
		debitTransactionArrayList.add(-15000);
		debitTransactionArrayList.add(-200);
		debitTransactionArrayList.add(-300);
		debitTransactionArrayList.add(-3000);
		
		
		//1. Total number of credit transactions completed using for loop
		for (int i=3; i>=1; i--) 
		{
			if (creditTransactionArrayList.size()>=i)
			{ 
				System.out.printf("1. Total credit transactions are: %d",+ creditTransactionArrayList.size() );
				System.out.printf(" and they are as: %s",creditTransactionArrayList);
				//System.out.println();
				break;
			}
		}
		

		//Total number of debit transactions completed using for loop
		for (int j=5; j>=1; j--) 
		{
			if (debitTransactionArrayList.size()>=j)
			{ 
				System.out.printf(" Total debit transactions are: %d",+ debitTransactionArrayList.size() );
				System.out.printf(" and they are as: %s",debitTransactionArrayList);
				System.out.println();
				break;
			}
		}
		 
		 //2. Print the total amount credited and debited in account
			// Print credit amount in account
				 int a = creditTransactionArrayList.get(0);
				 int b = creditTransactionArrayList.get(1);
				 int c = creditTransactionArrayList.get(2);
				 int d = a+b+c;
				 System.out.printf("2. Total amount credited from the account is: %d\t",d);
		
		 	// Print debit amount in account
				 int j = debitTransactionArrayList.get(0);
				 int k = debitTransactionArrayList.get(1);
				 int l = debitTransactionArrayList.get(2);
				 int m = debitTransactionArrayList.get(3);
				 int n = debitTransactionArrayList.get(4);
				 int o = j+k+l+m+n;
				 System.out.printf("Total amount debited from the account is: %d",o);
				 System.out.println();
		
		
		//3. Print total amount remaining at the end in Bank Account
		 int p = d+o;
		 System.out.printf("3. Total amount remaining at the end in Bank Account is: %d\n", p);
		 
		 
		 
		/*4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
			  Transaction with Amount” and also print total number of suspicious transactions*/
		 
		  int limit = 50000;
		  
		  switch (limit) 
		  {
		  	case 60000:
		  		System.out.println("4. Suspicious credit/debit Transaction with Amount");
		  		break;
		  	case 40000:
		  		System.out.println("4. Suspicious credit/debit Transaction with Amount");
		  		break;
		  	default:
		  		System.out.printf("4. Transaction amount is within limit: %d", limit);
		  		break;
		  }
	   }
	}
	
