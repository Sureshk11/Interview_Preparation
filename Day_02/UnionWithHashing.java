package Day_02;


import java.util.*;

public class UnionWithHashing
{
	
   
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
         Integer [] arr2=new  Integer[n];
         System.out.println("Enter Elements of Second array");
         
         for (int i=0;i<n;i++) 
         {
         	arr2[i]=sc.nextInt();
   
         }
         
         HashSet<Integer> set = new HashSet<>();
         
         
         set.addAll(Arrays.asList(arr1));
         
    
         set.addAll(Arrays.asList(arr2));
         
        
         Integer[] union = {};
         union = set.toArray(union);
         
    
         System.out.println("Union of two arrays is: " + Arrays.toString(union));
         
         
         
        
     
    }
}
