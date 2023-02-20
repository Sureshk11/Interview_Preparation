package Assignment1;

import java.util.Scanner;

public class Factorial 
{
	
	 
	 static int fact(int n)
	 {    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * fact(n-1));    
	 }    
		 public static void main(String args[]){  
		 
			 System.out.println("Enter the Number:");
		        Scanner sc = new Scanner(System.in); 
		        int num = sc.nextInt(); 
		         int result = fact(num);   
		  System.out.println("Factorial is: "+result);    
		 }  
	
	

}
