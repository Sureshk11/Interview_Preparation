package Day_03;

import java.util.Scanner;

public class CountStringVowels
{
    {

	    System.out.println("Enter string");
	    Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        
        int count = 0;
        char[] c = str.toCharArray();
		
        
        for (int i = 0; i < str.length() - 1; i++)
        {
        	if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println("Number of Vowels in a string : " + count);
       
        
    }
	
	
	
}
