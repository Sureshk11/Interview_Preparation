package Day_02;

import java.util.Scanner;

public class MissingNumber
{
	
	public static void missing(int arr[], int n)
    {
        int i;
        int temp[] = new int[n + 1];
        for (i = 0; i <= n; i++)
        {
            temp[i] = 0;
        }
 
        for (i = 0; i < n; i++)
        {
            temp[arr[i] - 1] = 1;
        }
 
        int ans = 0;
        for (i = 0; i <= n; i++)
        {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println("Missing Number is "+ans);
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
        
      missing(arr, n);
    }
}
