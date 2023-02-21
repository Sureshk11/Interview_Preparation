package Day_02;
import java.util.Scanner;

public class PairOfElements {

	 static boolean pair(int arr[], int n, int x)
	    {
	        for (int i = 0; i < (n - 1); i++)
	        {
	            for (int j = (i + 1); j < n; j++)
	            {
	                if (arr[i] + arr[j] == x)
	                {
	                    return true;
	                }
	            }
	        }
	 
	        return false;
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
        int x = -2;
        if (pair(arr, n, x)) 
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }
 }