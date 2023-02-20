package Assignment1;

import java.util.Scanner;

public class ArmStrongNumber 
{
	public static void main(String arg[])	
	{
		
		 Scanner sc=new Scanner(System.in);
	      System.out.print("Enter a number: ");
	      int num = sc.nextInt();
	      
	        int originalNum, remainder, result = 0, n = 0;

	        originalNum = num;

	        for (;originalNum != 0; originalNum /= 10, ++n);

	        originalNum = num;

	        for (;originalNum != 0; originalNum/= 10)
	        {
	            remainder = originalNum % 10;
	            result += Math.pow(remainder, n);
	        }

	        if(result == num)
	            System.out.println(num + " is  Armstrong number.");
	        else
	            System.out.println(num + " is not Armstrong number.");
	    
	}
}
	
