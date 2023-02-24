package Day_04;

import java.util.Scanner;

class InsertionSort
{


	static void isort(int a1[])
	{
		int n=a1.length;
		for(int i=1;i<n;++i)
		{
			int key = a1[i];
			int j=i-1;
			
			while(j>=0 && a1[j] > key)
			{
				a1[j+1]=a1[j];
				j=j-1;
			}
			a1[j+1]=key;
			display(a1);
					System.out.println();
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
		isort(arr);
		
	   
		
				
	
	}








}