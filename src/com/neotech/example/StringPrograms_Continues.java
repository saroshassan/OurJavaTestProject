package com.neotech.example;

public class StringPrograms_Continues {

	public static void main(String[] args) {
		
		//WRITE A PROGRAM TO FIND IF A STRING IS PALINDROME
//		
//		String str1="1331";
//		String reverse="";
//		for(int i=0;i<str1.length();i++)
//		{
//			char c=str1.charAt(i);
//			reverse=c+reverse;
//		}
//			if(str1.equalsIgnoreCase(reverse))
//			{
//				System.out.println("Its a palindrome");
//			}
//			else {
//				System.out.println("Its not a palindrome");
//			}
		
		
//CREATE A WORD ENCODING PROGRAM WHICH MOVES EACH LETTER BY 1. E.G A BECOMES C, B BECOMES D,  Y BECOMES A AND SO ON.
		
//		String str1="simple";
//		String str2="";
//		for(int i=0;i<str1.length();i++)
//		{
//			char c=str1.charAt(i);
//			
//			if(Character.toUpperCase(c)=='Y'||Character.toUpperCase(c)=='Z')
//			
//				c-=26;
//				c+=2;
//				str2=str2+c;
//			
//		}
//		System.out.println(str2);
		
		String str1="How to get a word";
		String space="",lSpace="";
		
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);
			if(c!=' ')
				space+=c;
			else {
				System.out.println(space);
				space="";
			}
			
		}
		
		
		
		
	


		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
