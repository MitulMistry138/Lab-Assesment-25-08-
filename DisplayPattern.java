/*
Program : Java Program to display pattern in 
		  1
		  12
		  123
		  1234
		  12345
@author:  Mitul Mistry
@date :25-08-2022  ( LAB ASSESSMENT)
*/

class DisplayPattern
{
    //method to print values 
	static void printPattern()  
	{
        for(int i=1;i<=5;i++)     // First loop for the first element 
		{
		for(int j=1;j<=i;j++)     // secomd loop to display the element after first loop 
		{
			System.out.print(j);  // print the elements   
		}
		System.out.println();     
	}
	}
       //calling main
public static void main(String ...args)
{
		// calling printValues main
  printPattern(); 
  }
 }