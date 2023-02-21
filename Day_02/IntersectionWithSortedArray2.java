package Day_02;

import java.util.*;

public class IntersectionWithSortedArray2
{
	public static void Intersection(Integer[] arr1, Integer[] arr2)
	{
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
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
         
         Intersection(arr1,arr2);
         
        
     
    }
}
