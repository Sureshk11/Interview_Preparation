package Technical;

public class ReverseString 
{
    
	
	 public static void main(String[] args) 
	   {
		   ReverseString  obj = new ReverseString ();
		   obj.reverse("I Love India");
		
	   }

public void reverse(String str)
{
	
	String[] words = str.split(" ");
	String reversedStr = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	       {
		
        	   reverseWord = reverseWord + word.charAt(j);
	       }
	       reversedStr = reversedStr + reverseWord + " ";
	     }
	System.out.println(str);
	System.out.println(reversedStr);
		

}
	
}
