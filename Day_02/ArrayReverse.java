package Day_02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse
{
	
	 public int[] reverse(int [] arr){

	        if( arr == null ||  arr.length <= 1){
	            System.out.println("Invalid array.");
	        }
	        for (int i = 0; i <  arr.length / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[ arr.length - 1 - i];
	            arr[ arr.length - 1 - i] = temp;
	        }
	        return  arr;
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
	         ArrayReverse arrayReverse = new ArrayReverse();
	         System.out.println("Original array" + Arrays.toString(arr));
	         System.out.println("Reversed array" + Arrays.toString(arrayReverse.reverse(arr)));
	    
	    }
	
	
	
}
