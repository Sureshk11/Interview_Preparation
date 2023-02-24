package Day_04;

import java.util.Scanner;

class LinearSearchDemo{
	
	
	static int lsearch(int a1[],int key)
	{
			int n = a1.length;
			for(int i=0;i<n;i++){
				if(a1[i] == key)
					return i;
			}
			return -1;
	}
	
	public static void main(String args[]){
		
		
		System.out.println("Enter the size of array ");
     	Scanner sc=new Scanner(System.in);
     	int n = sc.nextInt();
     	
        int [] arr=new int[n];
         System.out.println("Enter Elements of array");
         
         for (int i=0;i<n;i++) 
         {
         	arr[i]=sc.nextInt();
   
         }
        System.out.println("Enter Key:");
 		int key = sc.nextInt();
		int res = lsearch(arr,key);
		if(res == -1)
			System.out.println("key Not found ");
		else
			System.out.println("key Found at Index:"+res);
		
	}
}