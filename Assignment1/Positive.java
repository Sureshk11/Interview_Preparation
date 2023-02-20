package Assignment1;

import java.util.Scanner;

public class Positive 
{
	
	 
	 static void check(int num)
	 {    
		 if(num>0) 
		 {
			 System.out.println("Number is Positive");
		 }
		 else 
			 if(num<0) 
			 {
				 System.out.println("Number is Negative"); 
			 }
			 else if(num==0) 
			 {
				 System.out.println("Number is neither positive or Negative");
			 }
		 
	 }    
		 public static void main(String args[]){  
		 
			 System.out.println("Enter the First Number :");
		        Scanner sc = new Scanner(System.in); 
		        int num = sc.nextInt(); 
		        check(num);
		       
		       
		   
		 }  
	
	

}
