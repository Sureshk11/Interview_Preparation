package Day_02;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroAtEnd
{
	
	public static void reorder(int[] arr)
    {
        
        int k = 0;
 
       
        for (int i: arr)
        {
          
            if (i != 0) {
                arr[k++] = i;
            }
        }
 
        
        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }
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
	         reorder(arr);
	         System.out.println(Arrays.toString(arr));
	    
	    }
	
	
	
}
