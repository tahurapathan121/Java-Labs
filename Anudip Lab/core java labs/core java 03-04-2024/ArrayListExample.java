/* 3. Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.
Sample Input:
2,5,8,10,15
Expected Output :sum of even number is 20*/

package com.collectionFramework;
import java.util.ArrayList;

public class ArrayListExample 
{
	    public static void main(String[] args) 
	    {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(2);
	        numbers.add(5);
	        numbers.add(8);
	        numbers.add(10);
	        numbers.add(15);

	        int sum = 0;

	        for (int n : numbers) 
	        {
	            if (n % 2 == 0) 
	            {
	                sum += n;
	            }
	        }

	        System.out.println("Sum of even numbers: " + sum);
	    }
}
//output is->> Sum of even numbers: 20


