package Day_03;

import java.util.Scanner;

public class SwapString 
{
	 public static void swap(String str1,String str2)
	 {
		 System.out.println("Value of str1 before swapping :"+str1);
	      System.out.println("Value of str2 before swapping :"+str2);
	      int i = str1.length();
	      str1 = str1+str2;
	      str2 = str1.substring(0,i);
	      str1 = str1.substring(i);
	      System.out.println("Value of str1 after swapping :"+str1);
	      System.out.println("Value of str2 after swapping :"+str2);
	 } 
	
	 public static void main(String[] args) 
	 {
		
		 System.out.println("Enter  First string");
		 Scanner sc=new Scanner(System.in);
	     String str1= sc.nextLine();
	     System.out.println("Enter  Second string");
	     String str2= sc.nextLine();
	     swap(str1,str2);
	     
	     
	  }
	
	

}
