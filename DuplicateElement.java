/*
program :- Write a program to remove duplicate entry from array
author:- Mitul V Mistry 
date :- 25-08-2022 (Lab Assesment)
*/

import java.util.*;                       // import all the util classes
 class DuplicateElement                   // naming class as Duplictae Element
{
public static int removeDuplicates(int a[], int n)   // creating int method and giving variables 
{
        if (n == 0 || n == 1)                        // if condition started  
         {
         return n;
         }

// creating another array for only storing
// the unique elements
int[] temp = new int[n];                       
int j = 0;

        for (int i = 0; i < n - 1; i++)      //  frist loop        
		{
          if (a[i] != a[i + 1])            
		  {
            temp[j++] = a[i];
             }
          }

           temp[j++] = a[n - 1];

// Changing the original array
           for (int i = 0; i < j; i++)       // second loop
		   {
            a[i] = temp[i];
           }

           return j;
    }
public static void main(String ...args)
{
       Scanner s = new Scanner(System.in);             // Creating scanner to get input from user        
       System.out.print("Enter no. of elements you want in array:");   
       int n;
       n = s.nextInt();

     int a[] = new int[n];                           // creating new array to store the input value given by user
     System.out.println("Enter all the elements:");  
    for(int i = 0; i < n; i++)
    {
      a[i] = s.nextInt();
    }

    n = removeDuplicates(a, n);

// Printing The array elements
   for (int i = 0; i < n; i++)
  System.out.print(a[i] + " ");
    }

}
