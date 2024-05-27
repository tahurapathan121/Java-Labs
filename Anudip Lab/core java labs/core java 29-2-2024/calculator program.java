import java.util.Scanner;

public class MiniCalculator 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
        String choice;

        for (int i = 1; i <= 5; i++) // using for Loop for calculations
		{
            System.out.println("Calculation " + i);

            System.out.println("Enter first number:"); //  first input
            int num1 = sc.nextInt();

            System.out.println("Enter second number:"); //  second input
            int num2 = sc.nextInt();

            System.out.println("Choose an operation from given (+, -, *, /):"); // 
            char operator = sc.next().charAt(0);

            int result = 0;

            switch (operator) 
			{
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) 
					{
                        result = num1 / num2;
                    } else 
					{
                        System.out.println("Error! Division by zero.");
                    }
                    break;
					
                default:
                    System.out.println("Invalid operator!");
            }

            System.out.println("Result: " + result); // Display the result

            System.out.println("Do you want to continue? (yes/no):"); // Ask the user if they want to continue
            choice = sc.next();

            // If user does not want to continue, exit the loop
            if (choice.equals("no")) //equals() is method of comparing strings
			{
                break;
				
            }
        }

        sc.close();
    }
}
