package Assignment1;

import java.util.Scanner;

public class PrintDigit 
{
	
	
	 
		 public static void main(String args[])
		 
		 
		 {  
			
			int  digit, count=0;  
			Scanner sc = new Scanner(System.in);  
			System.out.print("Enter a number: ");  
		
			int num=sc.nextInt();  
			
			int temp=num;  
	
			while(num>0)  
			{  
			
			num=num/10;  
			
			count++;  
			}  
			 
			while(temp > 0)  
			{  
			
			digit=temp%10;  
			
			System.out.println("Digit at place "+count+" is: "+digit);  
			temp=temp/10;  
			
			count--;  
			} 
		       
		   
		 }  
	
	

}
