//2. Create a program with a logic that throws the ArrayOutOfBoundException while accessing elements in an array. 
//[Hint: use array and loop and try to access the element beyond the last Index

package com.threadpackage;

public class Example 
{

	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 5}; // Declare and initialize an array with 5 elements
		// Accessing elements with exception handling
		try 
	    {
	       for (int i = 0; i <= array.length; i++) // Loop to access elements from index 0 to array.length
	         {
	                System.out.println("Element at index " + i + ": " + array[i]); // Attempt to access and print each element
	         }
	    }
	    catch (ArrayIndexOutOfBoundsException e) // Catch the ArrayIndexOutOfBoundsException
	    {
	            System.out.println("Exception Found: Tried to access element beyond the last index of the array.");
	    }
	    
	}
}