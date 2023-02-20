package Assignment1;

import java.util.Scanner;

public class SmallestNumber 
{
	 
		 public static void main(String[] args)   
		 {  
			    Scanner sc = new Scanner(System.in);  
				
			    System.out.print("Enter First number: ");  
			    int num1=sc.nextInt(); 
			    
				System.out.print("Enter Second number: ");  
			    int num2=sc.nextInt();
			    
				System.out.print("Enter Third number: ");  
				int num3=sc.nextInt();
				
		
		   if(num1<=num2 && num1<=num3)  
		   System.out.println("the smallest number is:"+num1);  
		 
		   else if (num2<=num1 && num2<=num3)  
			   System.out.println("the smallest number is:"+num2);   
		   else  
		 
			   System.out.println("the smallest number is:"+num3); 
		 }  
	

}
