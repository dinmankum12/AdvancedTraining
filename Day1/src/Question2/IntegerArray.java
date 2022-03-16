package Question2;

import java.text.DecimalFormat;

public class IntegerArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {3,2,4,4,6,4,5,7,3,2,3,3,5,1,2,0,0,0};  
        int sum = 0;  
		
        float avg = 0;
			int n = arr.length;
			int small,i;
			small=arr[0];
        
        //Loop through the array to calculate sum of elements  
        for ( i = 1; i < n; i++) {  
           sum = sum + arr[i]; 
           avg = sum/18;
			for(int j=1;j<n;j++)
			{
			if(arr[j]<small)
			small=arr[j];
			}
			System.out.print("\nThe smallest element is " + small );
			
        }  
        System.out.println("\nSum of all the elements of an array: " + sum);  
        System.out.println("\nthe average of a number :"+avg);
    }  
} 

