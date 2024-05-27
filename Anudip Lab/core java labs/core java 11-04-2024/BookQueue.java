//2. Write a program using ArrayDeque to add book names and add,delete the values from both ends of que.
package com.collectionFramework;
import java.util.ArrayDeque;

public class BookQueue 
{
	public static void main(String[] args) 
	{
        ArrayDeque<String> bookQueue = new ArrayDeque<>();

        // Adding books to the queue
        bookQueue.addLast("B1");
        bookQueue.addLast("B2");
        bookQueue.addLast("B3");

        System.out.println("Books in the queue: " + bookQueue);

        // Adding a book at the front of the queue
        bookQueue.addFirst("New Book");

        System.out.println("Books after adding a book at the front: " + bookQueue);

        // Deleting a book from the front of the queue
        String removedBook = bookQueue.removeFirst();

        System.out.println("Removed book from the front: " + removedBook);
        System.out.println("Books after removing a book from the front: " + bookQueue);

        // Deleting a book from the end of the queue
        String removedLastBook = bookQueue.removeLast();

        System.out.println("Removed book from the end: " + removedLastBook);
        System.out.println("Books after removing a book from the end: " + bookQueue);
    }
}

