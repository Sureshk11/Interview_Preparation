package Day_03;

import java.util.Scanner;

public class IsRotation 
{
	 public static boolean checkRotation(String str1,String str2)
	 {
		 if (str1.length() != str2.length())
	            return false;

	        String temp = str1 + str1; 

	        if (temp.indexOf(str2) != -1)
	        {
	            return true; 
	        } else 
	        {
	            return false;
	        }
	 } 
	
	 
	 
	 public static void main(String[] args) 
	 {
		
		 System.out.println("Enter First string");
		 Scanner sc=new Scanner(System.in);
	     String str1= sc.nextLine();
	     
	     System.out.println("Enter Second string");
	     String str2= sc.nextLine();
	     
	     
	     
	     boolean result=checkRotation(str1, str2);
	      
	        if(result)
	        {
	            System.out.println(" Given Strings are rotations of each other.");
	        }
	        else
	        {
	            System.out.println("Given Strings are not rotations of each other.");
	        }
	  }
	
	

}
