package array;
import java.util.*;
public class Assending 
{
         public static void main(String[] args)//main method 
     {
        assending(); //calling for print 
     }

    public static void assending() //make the nw method by help of function
    {
        
        int[] arr = new int[10];//uisng array and set the lenght of array
        int temp=0;//declared variable
        
        System.out.print("Please enter the 10 values : "); //get the inpuut from user 
        
        for(int i=0; i<arr.length;i++) //uisng for loop 
        {
            Scanner sc = new Scanner(System.in); //scanner object
            arr[i] = sc.nextInt(); 
            
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j]) //using statement 
                {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp; 
                }
            }
        }

        System.out.println();


        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++)
         {     
             System.out.print(arr[i] + " ");    

         }  
    }    
      
     

 }
