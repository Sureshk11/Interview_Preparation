package Assignment1;

import java.util.Scanner;

public class LeapYear 
{
	
	 
	 static void check(int year)
	 {    
		if (year%4==0 && year%100==0 || year%400==0 ) 
		{
			System.out.println(year+" is Leap Year");
		}
		else 
		{
			System.out.println(year+" is not Leap Year");
		}
	 }   
	 
		 public static void main(String args[]){  
		 
			 System.out.println("Enter the Year :");
		        Scanner sc = new Scanner(System.in); 
		        int year = sc.nextInt(); 
		        check(year);
		       
		       
		   
		 }  
	
	

}
