package array;

public class Smaller_array {

	public static void main(String[] args) {
		Smaller(); //calling the  method.. 
	}
	public static void Smaller() //create accept method 
	{
		int min=0,i;//declartion of variable 
		int arr[] = {12,54,3,11,5 }; // using array
		min=arr[0];  //let the min is equal to array in length 1 means array[0]..
		for( i=1;i<arr.length;i++) //using for loop
		{
		    if( min>arr[i])  //using condition statement
		    {
		    	min=arr[i]; //now here is min is equal to array[i]..
		    }
		}
		System.out.println( " Smallest value is : "+min); //print the statement
	}

}




