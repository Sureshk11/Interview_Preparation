package Day_02;

import java.util.*;

public class UnionWithUnsorted
{
	 static void getUnion(Integer[] arr1,Integer[] arr2,int n, int m)
	    {
	        Map<Integer, Integer> mp
	            = new HashMap<Integer, Integer>();
	  
	     
	        for (int i = 0; i < n; i++) {
	            mp.put(arr1[i], i);
	        }
	        for (int i = 0; i < m; i++) {
	            mp.put(arr2[i], i);
	        }
	  
	        System.out.println(
	            "The union set of both arrays is :");
	        for (Map.Entry mapElement : mp.entrySet()) {
	            System.out.print(mapElement.getKey() + " ");
	  
	        }
	    }
   
    public static void main(String[] args)
    {

        System.out.println("Enter the size of array ");
     	Scanner sc=new Scanner(System.in);
     	int n = sc.nextInt();
     	
        Integer [] arr1=new Integer[n];
         System.out.println("Enter Elements of First array");
         
         for (int i=0;i<n;i++) 
         {
         	arr1[i]=sc.nextInt();
   
         }
         System.out.println("Enter the size of second array ");
         int m = sc.nextInt();
      	
         
         Integer [] arr2=new  Integer[m];
         System.out.println("Enter Elements of Second array");
         
         for (int i=0;i<m;i++) 
         {
         	arr2[i]=sc.nextInt();
   
         }
         
            getUnion(arr1,arr2,n,m);
         
        
     
    }
}
