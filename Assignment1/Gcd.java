package Assignment1;

import java.util.Scanner;

public class Gcd 
{
	
	 
	 static int gcd(int num1, int num2)
	 {    
		 while(num1!=num2)   
		 {  
		     if(num1>num2)  
			 num1=num1-num2;  
		 else  
			 num2=num2-num1;  
		 }  
		return num2;
		 
	 }    
		 public static void main(String args[]){  
		 
			    System.out.println("Enter the First Number :");
		        Scanner sc = new Scanner(System.in); 
		        int num1 = sc.nextInt(); 
		        
		        System.out.println("Enter the Second Number :");
		        int num2 = sc.nextInt();
		        
		        int result=gcd(num1,num2);
		        System.out.println("Gcd is:"+result);
		 }  
	
	

}
