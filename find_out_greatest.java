//WAP in which you have to accept 10 numbers from the user and find out the greatest number.
package array;

import java.util.Scanner;

public class find_out_greatest {
    public static void main( String args[]) {
    	
    	accept_no(); //call for print the accept-no method
    	
    }
    public static void accept_no()  //create the method 
    {
    	int size; //decalered the varaiable and datatype is int...
    	
    	Scanner sc = new Scanner(System.in); //create scanner object
    	System.out.print("Please enter the  size of array : "); // get the input from user by help of scanner
    	size=sc.nextInt();
        
    	System.out.print("Please enter the  numbers : ");// get the input from user by help of scanner
        int[] arr = new int[size];       //using array and defined length of array
        for(int i=0; i<arr.length;i++)
        {  
            arr[i] = sc.nextInt();  
        }
        int max = arr[0];  
         for (int i = 1; i < arr.length; i++)
         {
                if (arr[i] > max)
                 max = arr[i];
         }
         System.out.println("The greatest number is :  "+max);  //print the greatetst value 
     }
      

    	

    }
