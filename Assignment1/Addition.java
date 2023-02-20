package Assignment1;

import java.util.Scanner;

public class Addition 
{
	
	 
	 static int add (int num1, int num2)
	 {    
		 for (int i = 1; i <= num2; i++) 
		     num1++;
	         return num1;
		
		 
	 }    
		 public static void main(String args[]){  
		 
			    System.out.println("Enter the First Number :");
		        Scanner sc = new Scanner(System.in); 
		        int num1 = sc.nextInt(); 
		        
		        System.out.println("Enter the Second Number :");
		        int num2 = sc.nextInt();
		        
		        int result=add(num1,num2);
		        System.out.println("Addition is:"+result);
		 }  
	
	

}
