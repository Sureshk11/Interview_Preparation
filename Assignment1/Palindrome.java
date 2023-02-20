package Assignment1;

import java.util.Scanner;

public class Palindrome 
{
	 static void palin(int num) 
	 { 
		 int  reversed = 0, remainder, original;
		 original = num;
	     while (num != 0) 
	     {
	        remainder = num % 10;
	        reversed = reversed * 10 + remainder;
	        num /= 10;
	      }

	   
	    if (original == reversed)
	       
	    System.out.println(original+" is a palindrome");
	    else
	    	 System.out.println(original+" is Not a  palindrome");
	  
		 
	 }
	
	 
		 public static void main(String args[])
		 
		 
		 {  
			
		
			Scanner sc = new Scanner(System.in);  
			System.out.print("Enter a number: ");  
		
			int num=sc.nextInt();
			palin(num);
			
			
			
			
		
		   
		 }  
	
	

}
