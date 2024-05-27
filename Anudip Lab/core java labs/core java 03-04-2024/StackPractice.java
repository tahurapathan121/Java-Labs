/*4.Write a program to declare stack.Store 10 elements into it.Remove 4 elements from
stack and display it.*/

package com.collectionFramework;
import java.util.Stack;

public class StackPractice 
{

	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<Integer>();
		//adding 10 elements to stack
		s.add(2);
		s.add(4);
		s.add(6);
		s.add(8);
		s.add(10);
		s.add(12);
		s.add(14);
		s.add(16);
		s.add(18);
		s.add(20);
		System.out.println("The total Elements of Stack are: "+s);
		
		//removing four elements from stack
		int p=s.pop();
		System.out.println("pop element: "+p);
		System.out.println("updated stack: "+s);
		
		int p1=s.pop();
		System.out.println("pop element: "+p1);
		System.out.println("updated stack1: "+s);
		
		int p2=s.pop();
		System.out.println("pop element: "+p2);
		System.out.println("updated stack2: "+s);
		
		int p3=s.pop();
		System.out.println("pop element: "+p3);
		System.out.println("updated stack final: "+s);
		
	}

}
/*Output is: 
 The total Elements of Stack are: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
pop element: 20
updated stack: [2, 4, 6, 8, 10, 12, 14, 16, 18]
pop element: 18
updated stack1: [2, 4, 6, 8, 10, 12, 14, 16]
pop element: 16
updated stack2: [2, 4, 6, 8, 10, 12, 14]
pop element: 14
updated stack final: [2, 4, 6, 8, 10, 12]*/
