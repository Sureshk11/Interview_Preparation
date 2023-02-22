package Day_03;

import java.util.Scanner;

public class AllPermutations
{
	static void printpermutations(String str, String ans)
    {
 
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
         
            char ch = str.charAt(i);
 
          
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
 
           
            printpermutations(ros, ans + ch);
        }
    }
   
 
  public static void main(String args[])
  {
       
	  Scanner sc = new Scanner(System.in);

	  
	  System.out.print("Enter String ");
	  String str = sc.nextLine();
    
       
      
      printpermutations(str,"");
  }

}
