package Assignment1;

import java.util.Scanner;

public class Factorial2 
{
	
	static int factorial(int num) 
	{
	
	   int n=num,fact=1;
	 
        for(int i=1;i<=n;i++)
	    {

	      fact=fact*i;
	     }
         
        return fact;
	}

	
    public static void main(String args[])
    {  
	 
	   System.out.println("Enter the Number:");
       Scanner sc = new Scanner(System.in); 
       int num = sc.nextInt(); 
       int result = factorial(num);   
       System.out.println("Factorial is: "+result);    
     }  



}



