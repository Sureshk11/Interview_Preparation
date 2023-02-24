package Day_04;

import java.util.Scanner;

class binarySearchDemo
{


    static int bsearch(int arr[],int key,int l,int r)
	{
	     if(r>=l)
		 {
		    int mid = l+(r-l)/2;
		     
			if(arr[mid]==key)
			{
			  return mid ;
			} 
		       
			     if(arr[mid]<key)
			     return bsearch(arr,key,mid+1,r);
			     if(arr[mid]>key)
			     return bsearch(arr,key,l,mid-1);
		     
	
		 } 
		 return -1; 
		 
		 
	
	
	}




	public static void main(String args[])
	{
	
		System.out.println("Enter the size of array ");
     	Scanner sc=new Scanner(System.in);
     	int nos = sc.nextInt();
     	
        int [] arr=new int[nos];
         System.out.println("Enter Elements of array");
         
         for (int i=0;i<nos;i++) 
         {
         	arr[i]=sc.nextInt();
   
         }
		int n = arr.length;
		
		
		System.out.println("Enter Key:");
		int key = sc.nextInt();
		
	    int res = bsearch(arr,key,0,n-1);
		if(res==-1)
		{
		    System.out.println("key is not found :");
		   
		}
		else
		{
		   System.out.println("key found at index :"+res);
	
		}
		
				
	
	}








}