//WAP to create a simple calculator program that takes user input for two numbers and an operator (+, -, *, /) and performs the corresponding arithmetic operation using conditional statements.
import java.util.Scanner;

class Calculator 
{
    public static void main(String[] args) //main method for testing
	{
        Scanner sc = new Scanner(System.in); // take input from user
		
        System.out.print("Enter first num: "); //enter first input
        int num1 = sc.nextInt();

        System.out.print("Enter second num: "); //enter second input
        int num2 = sc.nextInt();

        System.out.print("Enter the operator from given (+, -, *, /): "); //user will choose the operation to do
        char operator = sc.next().charAt(0); // Use next() to read a string and then charAt(0) to get the first character

        int result = 0; 

        if (operator == '+')
		{
            result = num1 + num2;
        } 
		else if (operator == '-') 
		{
            result = num1 - num2;
        } 
		else if (operator == '*') 
		{
            result = num1 * num2;
        } 
		else if (operator == '/') 
		{
            result = num1 / num2;
        }

        System.out.println("Answer: " + result);
    }
}
