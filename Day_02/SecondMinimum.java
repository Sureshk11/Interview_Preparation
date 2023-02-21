package Day_02;
import java.util.Scanner;

public class SecondMinimum {

	public static int getNumber(int[] arr, int n){  
		int temp;  
		for (int i = 0; i < n; i++)   
		        {  
		            for (int j = i + 1; j < n; j++)   
		            {  
		                if (arr[i] > arr[j])   
		                {  
		                    temp = arr[i];  
		                    arr[i] = arr[j];  
		                    arr[j] = temp;  
		                }  
		            }  
		        }  
		       return arr[1];  
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
        int result=getNumber(arr,n);
        System.out.println("Second Minimum Number is:"+result);
        
    }
 }