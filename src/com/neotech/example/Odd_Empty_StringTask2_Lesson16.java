package com.neotech.example;


public class Odd_Empty_StringTask2_Lesson16 {

	public static void main(String[] args) {
		//Create a String and if the String is not empty perform the following:
			//- if the String has an odd number of characters and has 3 or more characters, print the character in
			//the middle of the String.
		
		String str1="Sarosh";
		int length=str1.length();
		if(!str1.isEmpty())
		{
			
			if(length%2==1&& length>=3)
			{
				System.out.println(str1.charAt(length/2));
			}
			else
			{
				System.out.println("the lemgth is even or less than 3");
			}
			
		}
		
		else {
			System.out.println("the string is empty");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
