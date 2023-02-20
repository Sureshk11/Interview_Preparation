package Assignment1;

import java.util.Scanner;

public class Swap2 
{
	
	 
	 static void swap(int num1,int num2)
	 {    
		 System.out.println("Before Swaping:"+"num1="+num1+"num2="+num2);
		
		 num1=num1+num2;
		 num2=num1-num2;
		 num1=num1-num2;
		 
		 System.out.println("After Swaping:"+"num1="+num1+"num2="+num2);
		 
		 
	 }    
		 public static void main(String args[]){  
		 
			 System.out.println("Enter the First Number :");
		        Scanner sc = new Scanner(System.in); 
		        int num1 = sc.nextInt(); 
		        
		        System.out.println("Enter the Second Number :");
		        int num2=sc.nextInt();
		        
		        swap(num1,num2);
		   
		 }  
	
	

}
