//1. Create two threads. One thread is finding the average of the first 10 numbers and 
//another thread is printing the square of the number stored in array arr={1,20,50,15,30}
//and make sure both threads can execute simultaneously.

package com.threadpackage;

class Average extends Thread //creating the class that extends the thread class
{
    public void run() // Override the run method of the Thread class
	{
        int sum = 0;
        for (int i = 1; i <= 10; i++) // Calculate the sum of the first 10 numbers (1 to 10)
		{
            sum += i;
        }
        double average = (double) sum / 10; //calculating the average of first 10 numbers
        System.out.println("Average of the first 10 numbers: " + average);
    }
}

class Square extends Thread // create a class named SquareThread that extends Thread
{
    int[] arr = {1, 20, 50, 15, 30}; //make an array with some values

    public void run() // Override the run method of the Thread class
	{
        for (int num : arr) // Iterate through each element of the array
        	
		{	int square=num*num; //calculating square of each number
		
            System.out.println("Square of " + num + " is " + square);
        }
    }
}

public class ThreadMain 
{
    public static void main(String[] args) 
	{
        Average a = new Average(); //creating the object of Average class
        Square s = new Square(); //creating the object of Square class

        a.start(); //starting the average thread
        s.start(); //starting the square thread
    }
}