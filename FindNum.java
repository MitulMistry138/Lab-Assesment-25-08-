/*
program :- Program to find largest and second largest number in an array by using sorting method 
author:- Mitul V Mistry 
date :- 25-08-2022 (Lab Assesment)
*/

class FindNum
{
   static void printNum(int arr[]) // naming the method and giving value in it
   {
	   
	   // printing all the elements of the array
	    for(int i:arr)               // using Enhanced for loop      
		{
			System.out.println(i);   // printing the element entered by user
		}
	   sortElement(arr);   	   
	   
    }
   
   // method to sort the array
   
   static void sortElement(int array[])    // naming a second method and giving value to it 
   {
	   int sub= array.length;              // creating length of array 
	   
	   System.out.println("The size of the array is :"+ sub);  
	   int temp;  // temperally variable to store value 
	   
	   // sorting the array in ascending order
	   
	   for(int j=0;j<sub;j++)                 /// for first loop we are using j as an variable 
	   {
		   for(int k=j+1;k<sub;k++)           /// For second for loop using k as an vairable 
		   {
			   if(array[j]>array[k])           // giving condition if j is greter than k
			   {
				   temp=array[j];              
				   array[j]=array[k];
				   array[k]=temp;
				   
			   }
				   
		   }
		   
	   }
	   // ending sorting
	   
	   System.out.println("Largest element is:"+ array[sub-1]);              // printing element by substitute one element whish is largest from the array  
	   System.out.println("Second Largest element is:"+ array[sub-2]);       //  printing element by substitute one element which is second largest from the array 
	   
   }


   public static void main(String ...args)
   {
	  int size =args.length;             // giving variable size a value 
	   int newArray[]= new int[size];     // creating array named as size to store arguement length 
	   for(int i=0;i<size;i++)
	   {
 		   newArray[i]= Integer.parseInt(args[i]);   // converting to integer type
	   } 
	 	printNum(newArray);   
   }

  
}