//2. write a program in Java to create a Map Interface where we can store the cricketer name in it along with his scores and 
//search for the batsman name and display his score.
package com.collectionFramework;
import java.util.HashMap;
import java.util.Scanner;

public class MapInterfacePractice
{
	public static void main(String args[])
	{
		HashMap<String, Integer> cs= new HashMap<String, Integer>();
		cs.put("Virat", 90);
		cs.put("Hardik", 120);
		cs.put("Sachin", 60);
		cs.put("AB", 200);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NAME OF CRICKETER TO FIND HIS SCORE: ");
		String cricketerName = sc.nextLine();
		
		if (cs.containsKey(cricketerName)) //used contains key to check whether the cricketer name is there or not
		{
            int score = cs.get(cricketerName); //used get method to retrive the score of respective cricketer
            
            System.out.println("Score of " + cricketerName + " is: " + score);
        } 
		else 
		{
            
            System.out.println("Cricketer not found in the records.");
        }
		sc.close();
	}

}

/*  OUTPUT: ENTER THE NAME OF CRICKETER TO FIND HIS SCORE: 
Hardik
Score of Hardik is: 120    */