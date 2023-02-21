package Day_02;

import java.util.Scanner;

public class ArraysIntersection
{
	
	public static void intersection(int arr1[],int arr2[], int n)
    { 
		System.out.println("Intersection of the two arrays :");
		for(int i = 0; i<n; i++ ) 
		{
	         for(int j = 0; j<n; j++)
	         {
	            if(arr1[i]==arr2[j])
	            {
	               System.out.println(arr2[j]);
	            }
	         }
	      }
  
    }
   
    public static void main(String[] args)
    {

        System.out.println("Enter the size of array ");
     	Scanner sc=new Scanner(System.in);
     	int n = sc.nextInt();
     	
        int [] arr1=new int[n];
         System.out.println("Enter Elements of First array");
         
         for (int i=0;i<n;i++) 
         {
         	arr1[i]=sc.nextInt();
   
         }
         int [] arr2=new int[n];
         System.out.println("Enter Elements of Second array");
         
         for (int i=0;i<n;i++) 
         {
         	arr2[i]=sc.nextInt();
   
         }
         
         intersection(arr1,arr2,n);
         
         
         
        
     
    }
}
