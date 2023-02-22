package Day_03;

import java.util.Scanner;

public class SubsetUsingRecursion 
{
	static void powerSet(String str, int index, String current)
    {
        int n = str.length();
 
      
        if (index == n) 
        {
            return;
        }
 
        
        System.out.println(current);
 
        
        for (int i = index + 1; i < n; i++) 
        {
        	current += str.charAt(i);
            powerSet(str, i, current);
 
           
            current = current.substring(0, current.length() - 1);
        }
    }
 
    
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);

  	  
  	  System.out.print("Enter String ");
  	  String str = sc.nextLine();
        int index = -1;
        String current = "";
        powerSet(str, index, current);
    }
}
