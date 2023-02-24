package Technical;

public class Permutations 
{
    
	
	 public static void main(String[] args) 
	   {
		  String str = "RAM";
	      printPermute(str, "");
	   }

public static void  printPermute(String str, String ans)
{
	
	if (str.length() == 0)
	{
        System.out.print(ans + " ");
        return;
    }
    for (int i = 0; i < str.length(); i++)
    {

       
        char ch = str.charAt(i);

       
        String r = str.substring(0, i) + str.substring(i + 1);

       
        printPermute(r, ans + ch);
    }

}
	
}
