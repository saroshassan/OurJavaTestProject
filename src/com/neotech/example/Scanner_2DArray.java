package com.neotech.example;

import java.util.Scanner;

public class Scanner_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Ask the user how many rows do you want?
		//Ask the user how many columns do you want ?
		// Create the array (String[][] names)
		// Fill the array
		// Print the array
		// I will print using enhanced/advanced loop
		
		
		//Ask the user how many rows do you want?
		//Ask the user how many columns do you want 
		System.out.println("Please enter the number of rows you want ? ");
		int rows=input.nextInt();
		
		System.out.println("Please enter the number of columns you want ? ");
		int column=input.nextInt();
		
		// Create the array (String[][] names)
		String[][] names= new String[rows][column];
		
		// Fill the array
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("Please enter the namesto fill the array: ");
				names[i][j]=input.next();
			}
			
		}
		
		System.out.println("---------------------------------------------------------------");
		
		// Print the array
		// I will print using enhanced/advanced loop
		
		for(String[] i: names)
		{
			for(String j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
