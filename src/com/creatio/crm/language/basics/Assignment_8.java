package com.creatio.crm.language.basics;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment_8 {

	public static void main(String[] args) {
		
		/**
		 * Hike = ( Base Salary * variable pay % ) + Bonus+Reward ;
		   Hike % = Hike / Base Salary .
		 */
		int [] srNo = new int [] {1,2,3,4,5};
		String [] empNames = new String [] {"Alice Johnson","Bob Smith","Carol Davis","David Brown","Eva Green"};
		int [] baseSalary = new int [] {75000, 68000, 2000, 90000, 60000};
		int [] expYears = new int [] {5,3,7,10,2};
		float [] ratings = new float [] {(float) 4.2, (float) 3.8, (float) 4.5, 2, (float) 3.5};
		int reward = 5000;
		int [] bonus = new int [] {1500, 1200,300};
		int [] varPay = new int [] {15,10,3};
		
		
		//Hike = ( Base Salary * variable pay % ) + Bonus + Reward
		for (int i= 0; i<expYears.length; i++) 
		{
			if(expYears[i]>=5) 
			{
				int j=0, k = 0, l=0;
				int hike = (baseSalary[j]*varPay[k]) +  bonus[l] + reward;
				System.out.println(hike);
				j++; k++; l++;
				break;
				
			}
			
		}


	}

}
