//4.Create a base class with constructor and inherit it in the derived class 
//and call the base class constructor in derived class

class Human // Base or parent class
{
    int id=101; //variables of class Person
	String name="Sam";
	int age=23;

    public Human(int id, String name, int age) // parameterized Constructor
	{
        this.id = id;
		this.name = name;
		this.age = age;
        
    }
}

class Student extends Human // Derived or child class
{
    int rollNo=30;

    Student(int id, String name, int age, int rollNo) // Constructor of class Student
	{
        super(id, name, age); //calling constructor of main class Human using super keyword
		
        this.rollNo = rollNo;
		
    }
}

public class HumanDemo
{
    public static void main(String[] args) //main method
	{
        Student s1= new Student(101,"Sam",23,30); // Creating an object of child class student
		
		System.out.println("The name is: "+s1.name); //printing the details
		System.out.println("The age is: "+s1.age); 
		System.out.println("The id is: "+s1.id); 
		System.out.println("The roll Num is: "+s1.rollNo);

    }
}
