package Day_02;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroAtBegining
{
	
	public static void reorder(int[] arr)
    {
        
		int current = arr.length - 1;

        //3
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
            	arr[current] = arr[i];
                current--;
            }
        }

        //4
        while (current >= 0) {
        	arr[current] = 0;
            current--;
        }

        //5
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
