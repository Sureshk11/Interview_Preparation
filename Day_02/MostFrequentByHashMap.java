package Day_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentByHashMap
{
	static int mostFrequent(int arr[], int n)
    {
          
        
        Map<Integer, Integer> hp =
               new HashMap<Integer, Integer>();
          
        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }
          
        // find max frequency.
        int max_count = 0, res = -1;
          
        for(java.util.Map.Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
          
        return res;
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
         int result=mostFrequent(arr, n);
         
         System.out.println("MOst frequent Number is "+result);
         
         
    }
}
