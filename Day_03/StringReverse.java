package Day_03;

import java.util.Scanner;

public class StringReverse
{
	public static void main (String[] args) 
    {

	    System.out.println("Enter  string");
	    Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String  nstr="";
        char ch;
        
         System.out.print("Original word: ");
         System.out.println(str); 
        
        for (int i=0; i<str.length(); i++)
        {
         ch= str.charAt(i); 
         nstr= ch+nstr; 
        }
         System.out.println("Reversed word: "+ nstr);
    }
	
	
	
}
