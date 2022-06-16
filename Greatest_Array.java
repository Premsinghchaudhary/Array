
package array;

public class Greatest_Array {
    public static void main( String args[]) {
    	
    	Greatest();  //calling the accept method..  
    }
    public static void Greatest() //create accept method 
    {
    	int i,max=0; //declartion of variable 
    	int arr[] = {1,4,5,7,8};  // using array 
    	max = arr[0];             //let the max is equal to array in length 1 means array[0]..
    	for(i = 1; i<arr.length; i++) //using for loop 
    	{
    		if(max< arr[i])  //using condition statement 
    		{
    			max = arr[i];  //now here is max is equal to array[i].. 
    	    }
    	}
    	System.out.print("Greater Value is : "+max);  //print the statement 
    }
}

