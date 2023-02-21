package Day_02;

import java.util.Scanner;

public class MostFrequent
{
	 public static int mostFrequent(int[] arr, int n)
	  {
	    int maxcount = 0;
	    int element_with_max_freq = 0;
	    for (int i = 0; i < n; i++) 
	    {
	      int count = 0;
	      for (int j = 0; j < n; j++)
	      {
	        if (arr[i] == arr[j])
	        {
	          count++;
	        }
	      }
	  
	      if (count > maxcount)
	      {
	        maxcount = count;
	        element_with_max_freq = arr[i];
	      }
	    }
	  
	    return element_with_max_freq;
	  }
    public static void main(String[] args)
    {

        System.out.println("Enter the size of array ");
     	Scanner sc=new Scanner(System.in);
     	int n = sc.nextInt();
     	
        int [] arr=new int[n];
         System.out.println("Enter Elements of array");
         
         for (int i=0;i<n;i++) 
         {
         	arr[i]=sc.nextInt();
   
         }
         int result=mostFrequent(arr, n);
        
         System.out.println("MOst frequent Number is "+result);
    }
}
