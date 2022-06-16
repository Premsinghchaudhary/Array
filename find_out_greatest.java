//WAP in which you have to accept 10 numbers from the user and find out the greatest number.
package array;

import java.util.Scanner;

public class find_out_greatest {
    public static void main( String args[]) {
    	
    	accept_no();
    	
    }
    public static void accept_no() 
    {
        int[] arr = new int[10];
        
        System.out.print("Please enter the 10 numbers : ");
        
        for(int i=0; i<arr.length;i++)
        {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        
        
        int max = arr[0];
         for (int i = 1; i < arr.length; i++)
         {
                if (arr[i] > max)
                 max = arr[i];
         }
         System.out.println("The greatest number is :  "+max);
     }
      

    	

    }
