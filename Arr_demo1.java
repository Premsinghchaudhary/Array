package array;

import java.util.Scanner;  

public class Arr_demo1  
{
	int size,i,j,temp; //declered the variable and data type is int..
	public int[] accepting_array() // create a 'method by using function'
	{
		Scanner sc=new Scanner(System.in);//create scanner object
		System.out.println("\nEnter the size"); //get input from user 
		size=sc.nextInt();   //pass the value of size in scanner
		int[] num=new int[size];  
		System.out.println("Enter "+size+" numbers");
		
		for(i=0;i<size;i++) //using for loop
		{
			num[i]=sc.nextInt();  //pass the value of num[i]in scanner
		}
		
		System.out.println("\nThe numbers are"); //print the numbers those the user can enter
		for(i=0;i<size;i++) //using for loop
		{
			System.out.print(num[i]+"\t");
		}
		
		return num;		//return the number 
	}
	public void ascending()  //create method by using function
	{
		int arr[]=accepting_array();  //use the value of accepting_array method
		for(i=0;i<size;i++) //using for loop 'row'
		{
			for(j=i+1;j<size;j++)  //using for loop 
			{
				if(arr[i]>arr[j]) //condition statemnt 
				{
					temp=arr[i];  // swapping the number using third variable
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nNumbers is ascending order:");  //print the ascending order
		for(i=0;i<size;i++) //for loop
		{
			System.out.print(arr[i]+"\t"); 
		}
	}
	public void descending()
	{
		int[] arr=accepting_array(); //use the value of accepting_array method
		
		for(i=0;i<size;i++) //using for loop
		{
			for(j=i+1;j<size;j++) //using for loop
			{
				if(arr[i]<arr[j])//condition statemnt 
				{
					temp=arr[i];// swapping the number using third variable
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nNumbers is DESC order:"); //print the descending order
		for(i=0;i<size;i++)//using for loop 
		{
			System.out.print(arr[i]+"\t");
		}
	}
	
	public void greater()
	{
		int[] arr=accepting_array();//use the value of accepting_array method
		temp=arr[1];  
		
		for(i=0;i<size;i++) //for loop 
		{
			if(temp<arr[i])
			{
				temp=arr[i]; 
			}
		}
		System.out.println("\nThe greater number is = "+temp);	//print the temp value is greater
	}
	public void smaller()
	{
		int[] arr=accepting_array();//use the value of accepting_array method
		temp=arr[1];
		
		for(i=0;i<size;i++) //for loop
		{
			if(temp>arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("\nThe smaller  number is = "+temp);  	//print the temp value is smaller
	}
	public void average()  //create the new method for average
	{ 
		int sum =0; //declared varaiable 
		int[] arr = accepting_array();  //use the value of accepting_array method
		for(i=0; i<size; i++) //for loop
		{
			sum += arr[i];
		}
		double  avg = sum/size; //using 'double' datatype 
		System.out.println(" \nAverage of Array : "+avg); //print the average of numbers
	}
	

}
