//Create a class named Book with attributes title, author, ISBN, and price. Include methods to get and set the attributes
class Book 
{
    String title;
    String author;
    String ISBN;
    int price;

    
    public Book(String title, String author, String ISBN, int price) // parameterized Constructor
	{
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Get method
    String getTitle() 
	{
        return title;
    }

    String getAuthor() 
	{
        return author;
    }

    String getISBN() 
	{
        return ISBN;
    }

    int getPrice() 
	{
        return price;
    }

    // Set method
    void setTitle(String title) 
	{
        this.title = title;
    }

    void setAuthor(String author) 
	{
        this.author = author;
    }

    public void setISBN(String ISBN) 
	{
        this.ISBN = ISBN;
    }

    public void setPrice(int price) 
	{
        this.price = price;
    }
}

public class BookDemo 
{
    public static void main(String[] args) 
	{
        
        Book book = new Book("Happy Life", "Sneha Das", "1234", 30); // Create a new Book object

        System.out.println("Title: " + book.getTitle()); // Display the book details
		
        System.out.println("Author: " + book.getAuthor());
		
        System.out.println("ISBN: " + book.getISBN());
		
        System.out.println("Price: " + book.getPrice());
	}
}

