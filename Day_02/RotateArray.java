package Day_02;

import java.util.*;
public class RotateArray 
{
	
	 public static void main(String[] args) {    
	            

	        System.out.println("Enter the size of array ");
	     	Scanner sc=new Scanner(System.in);
	     	int n = sc.nextInt();
	     	
	        int [] arr=new int[n];
	         System.out.println("Enter Elements of array");
	         
	         for (int i=0;i<n;i++) 
	         {
	         	arr[i]=sc.nextInt();
	   
	         }   
	           
	       
	        System.out.println("Original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");     
	        }      
	            
	           
	        for(int i = 0; i < n; i++){    
	            int j, last;    
	              
	            last = arr[arr.length-1];    
	            
	            for(j = arr.length-1; j > 0; j--)
	            {    
	                   
	                arr[j] = arr[j-1];    
	            }    
	            
	            arr[0] = last;    
	        }    
	        
	        System.out.println();    
	            
	        
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }    
	    }    

}
