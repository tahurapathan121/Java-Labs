//write a class with the name Perimeter using method overloading that computes perimeter of a square, rectangle and circle.
//formula: perimeter of square: 4*s, rectangle: 2*(l+b), circle: 2*(3.14)*r

import java.util.Scanner;

class Perimeter //main class
{
    Scanner sc = new Scanner(System.in); //taking input from user

    void find(int side) //method with one parameter
	{
        int perimeter = 4 * side;
        System.out.println("The perimeter of square is: " + perimeter);
    }

    void find(double l, double b) //method with two parameters
	{
        double perimeter = 2 * (l + b);
        System.out.println("The perimeter of rectangle is: " + perimeter);
    }

    void find(float radius) //method with different data type parameter
	{
        double perimeter = 2 * 3.14 * radius;
        System.out.println("The perimeter of circle is: " + perimeter);
    }
}

public class PerimeterDemo 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
		
        Perimeter p = new Perimeter();

        System.out.println("select shape to find perimeter:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
		
        int select = input.nextInt();

        switch (select) 
		{
			case 1:
                System.out.print("Enter the side length of the square: ");
                int side = input.nextInt();
                p.find(side);
                break;
				
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double l = input.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double b = input.nextDouble();
                p.find(l, b);
                break;
				
            case 3:
                System.out.print("Enter the radius of the circle: ");
                float radius = input.nextFloat();
                p.find(radius);
                break;
				
            default:
                System.out.println("Invalid option");
        }

        
    }
}
