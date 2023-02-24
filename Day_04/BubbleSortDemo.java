package Day_04;

import java.util.Scanner;

class BubbleSortDemo
{


    static void bsort(int arr[])
	{
	     int n = arr.length;
		 for(int i =0;i<n;i++)
		 {
		    for(int j =0;j<n-1-i;j++)
			{
			   if(arr[j]>arr[j+1])
			   {
			         int temp = arr[j];
					 arr[j]  = arr[j+1];
					 arr[j+1]= temp;
				     display(arr);	
					 System.out.println();
			   }
			
			 System.out.println();
			}
		 
		 
		 }
				 
		 
	}
	
	static void display(int arr[])
	{
	     int n = arr.length;
		 for(int i =0;i<n;i++)
		 {
		    System.out.print(arr[i]+" ");
		 
		 }
	
	
	}




	public static void main(String args[])
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
		bsort(arr);
		
	   
		
				
	
	}








}