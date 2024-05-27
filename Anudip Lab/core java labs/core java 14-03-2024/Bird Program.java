//1. Define interfaces 'Flyable' and 'Swimmable' with methods fly() and swim() resp. 
//Implement these interfaces in a class 'Bird' to demonstrate multiple interfaces implementation.

interface Flyable //first interface Flyable
{
    void fly();
}

interface Swimmable //second interface Swimmable
{
    void swim();

}

class Bird implements Flyable, Swimmable //extending the both interfaces using "implements"  
{
    public void fly() //method fly
	{
        System.out.println("The Bird is flying");
    }

    public void swim() //method swim
	{
        System.out.println("The Bird is swimming"); 
    }

}

public class BirdDemo 
{
    public static void main(String[] args) //main method of program
	{
        
        Bird b1 = new Bird(); // Creating an object of class Bird

        b1.fly();  // Calling methods of Bird
        b1.swim();
    }
}
