package Day_03;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram 
{ 
	 public static void main(String[] args) 
	 {

		   
		    Scanner sc = new Scanner(System.in);

		  
		    System.out.print("Enter first String: ");
		    String str1 = sc.nextLine();
		    System.out.print("Enter second String: ");
		    String str2 = sc.nextLine();

		 
		    if(str1.length() == str2.length()) 
		    
		    {

		
		    	char[] arr1 = str1.toCharArray();
		    	char[] arr2 = str2.toCharArray();

		  
		    	Arrays.sort(arr1);
		    	Arrays.sort(arr2);
		      	
		    	boolean result = Arrays.equals(arr1, arr2);

		    	if(result) 
		    	{
		    		System.out.println(str1 + " and " + str2 + " are anagram.");
		    	}
		    	else
		    	{
		    		System.out.println(str1 + " and " + str2 + " are not anagram.");
		    	}
		    }
		    else
		    {
		      System.out.println(str1 + " and " + str2 + " are not anagram.");
		    }

		    sc.close();
	}

}
