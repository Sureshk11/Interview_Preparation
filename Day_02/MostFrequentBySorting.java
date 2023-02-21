package Day_02;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentBySorting
{

    public static void main(String[] args)
    {
    	int element = Integer.MIN_VALUE, max_count=1, count=1;
    	
        System.out.println("Enter the size of array ");
     	Scanner sc=new Scanner(System.in);
     	int n = sc.nextInt();
     	
        int [] arr=new int[n];
         System.out.println("Enter Elements of array");
         
         for (int i=0;i<n;i++) 
         {
         	arr[i]=sc.nextInt();
   
         }
         
         
         
        
         
         Arrays.sort(arr);
         
         for(int i=1; i<arr.length; i++){
            
             if(arr[i] == arr[i-1])
                 count++;
                 
             if(arr[i] != arr[i-1] || i==arr.length-1){
                
                 if(count>max_count)
                 {
                     
                  
                     max_count = count;
                     element = arr[i-1];
                 } 
                 
                 count =1;
             }
         }
         

         System.out.println(element+": "+max_count); 
         
         
         
    }
}
