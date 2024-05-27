//1. Write a Java program to check whether a HashMap contains key-value mappings (empty) or not.
package com.collectionFramework;
import java.util.HashMap;

public class HashMapPractice 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> h=new HashMap<Integer,String>();
		
		h.put(1, "Science");
		h.put(2, "Maths");
		h.put(4, "English");
		h.put(4, "Marathi");
		System.out.println("The Hash Map: "+h);
		
		System.out.println("Checking whether the HashMap Has Key-value Mappings: "+h.isEmpty());
		
	}
}
//the output is: False