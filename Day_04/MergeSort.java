package Day_04;

import java.util.Scanner;

public class MergeSort {
	static void mergesort(int arr[],int low, int high)
	{
		if(low<high)
		{
			int mid=low+(high-low)/2;
			mergesort(arr,low,mid);
			mergesort(arr,mid+low,high);
			merging(arr,low,mid,high);
			
		}

	}

	static void merging(int arr[],int low, int mid, int high)
	{
		int n1= mid-low+1;
		int n2= high-mid;

		int L[]= new int[n1];
		int R[]= new int[n2];

		for(int i=0;i<n1;i++)
			L[i]=arr[low+i];

		for(int j=0;j<n2;j++)
			R[j]=arr[mid+1+j];
		

		int i=0,j=0;
		int k=low;
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		
		}
		while(i<n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}


	}
	static void display(int arr[])
	{
		int n =arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	public static void main(String args[]){
		

		System.out.println("Enter the size of array ");
     	Scanner sc=new Scanner(System.in);
     	int nos = sc.nextInt();
     	
        int [] arr=new int[nos];
         System.out.println("Enter Elements of array");
         
         for (int i=0;i<nos;i++) 
         {
         	arr[i]=sc.nextInt();
   
         }
		int n =arr.length;
		display(arr);
		System.out.println();
		
		mergesort(arr,0,n-1);
		
		
		
		display(arr);
		
		
		
	}

}
