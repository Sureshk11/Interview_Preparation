package Day_03;

import java.util.Scanner;

public class StringPalindrome 
{
	 public static boolean checkPalindrome(String str)
	 {
	        int left = 0, right = str.length() - 1;
	        
	        while(left < right)
	        {
	            if(str.charAt(left) != str.charAt(right))
	            {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	 } 
	
	 public static void main(String[] args) 
	 {
		
		 System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
	     String str= sc.nextLine();
	     
	     boolean result=checkPalindrome(str);
	      
	        if(result)
	        {
	            System.out.println(str+" is a Palindrome string");
	        }
	        else
	        {
	            System.out.println(str+" is Not a Palindrome string");
	        }
	  }
	
	

}
