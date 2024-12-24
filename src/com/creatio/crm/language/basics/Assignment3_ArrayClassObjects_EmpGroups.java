package com.creatio.crm.language.basics;

public class Assignment3_ArrayClassObjects_EmpGroups {

	public static void main(String[] args) 
	{
		Assignment3_ArrayClassObjects_Employees obj = new Assignment3_ArrayClassObjects_Employees();
		
		//Storing employees names in string array.
		String [] employeeNames = new String [3];
		employeeNames [0] = obj.empname1;
		employeeNames [1] = obj.empname2;
		employeeNames [2] = obj.empname3;
		
		//Storing employee ids in integer array.
		int [] empids = new int [3];
		empids [0] = obj.emp1ID;
		empids [1] = obj.emp2ID;
		empids [2] = obj.emp3ID;
		
		
		//Printing each employee's name along with their corresponding ID.
		//Print 1st employee data.
		System.out.printf("Employee1 Name: %s, ",obj.empname1);
		System.out.printf("Employee1 ID: %d\n",obj.emp1ID);
		
		//Print 2nd employee data.
		System.out.printf("Employee2 Name: %s, ",obj.empname2);
		System.out.printf("Employee2 ID: %d\n",obj.emp2ID);
		
		//Print 3rd employee data.
		System.out.printf("Employee3 Name: %s, ",obj.empname3);
		System.out.printf("Employee3 ID: %d\n",obj.emp3ID);
		
	}

}
