package Day_02;
import java.util.Scanner;

public class Average {

    public static void main(String[] args)
    {
       System.out.println("Enter the size of array ");
    	Scanner sc=new Scanner(System.in);
    	int n = sc.nextInt();
    	
        double [] arr=new double[n];
        System.out.println("Enter Elements of array");
        
        for (int i=0;i<n;i++) 
        {
        	arr[i]=sc.nextDouble();
        }
        
        
        double sum = 0.0;

        for (double num: arr) 
        {
           sum += num;
        }

        double average = sum / arr.length;
        System.out.format("The average is: %.2f", average);
        
    }
}