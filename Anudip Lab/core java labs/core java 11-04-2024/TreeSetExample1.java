// 3. Write a program using TreeSet insert Integer values and print them.
package com.collectionFramework;
import java.util.TreeSet;

public class TreeSetExample1
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> tS = new TreeSet<>();

        // Inserting integer values into the TreeSet
        tS.add(52);
        tS.add(25);
        tS.add(88);
        tS.add(14);
        tS.add(73);

        // Printing the TreeSet
        System.out.println("Integer values in TreeSet: " + tS);
    }

	}


