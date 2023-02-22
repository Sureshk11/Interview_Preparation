package Day_03;

import java.util.Scanner;

public class CountWordsUsingSplit
{
	public static int count(String str)
    {
       
    
      if (str == null || str.isEmpty())
          return 0;
       
      
      String[] words = str.split("\\s+");
       
     
      return words.length;
     }
   
 
  public static void main(String args[])
  {
       
	  Scanner sc = new Scanner(System.in);

	  
	  System.out.print("Enter String ");
	  String str = sc.nextLine();
    
       
      
      System.out.println("No of words : " +
         count(str));
  }

}
