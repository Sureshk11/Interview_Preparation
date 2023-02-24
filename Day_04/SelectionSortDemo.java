package Day_04;

import java.util.Scanner;

class SelectionSortDemo
{


    static void ssort(int arr[])
	{
	     int n = arr.length;
		 for(int i =0;i<n-1;i++)
		 {        int min=i;
		    for(int j =i+1;j<n;j++)
			{
				
			   if(arr[j]<arr[min])
			   {
				   min =j;
			   }
			}
		 
			         int temp = arr[min];
					 arr[min]  = arr[i];
					 arr[i]= temp;
	
				     display(arr);	
					 System.out.println();
			   
			
			
		 
		 }
			 System.out.println();	 
		 
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
		ssort(arr);
		
	   
		
				
	
	}








}