//A program that calculates Body Mass Index (BMI) based on user input of weight and height, and then categorizes the BMI into underweight, normal, overweight, or obese categories using if-else statements.

import java.util.Scanner;

class BMIFinder 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in kg: "); // Get user input for weight in kg
        double weight = sc.nextDouble();

        System.out.print("Enter your height in meters: "); // Get user input for height in meters
        double height = sc.nextDouble();

        double bmi = weight / (height * height); // formula for Calculate BMI

     
        String category; // Categorize BMI
		
        if (bmi < 18.5) 
		{
            category = "Underweight";
        } 
		else if (bmi < 25) 
		{
            category = "Normal weight";
        } 
		else if (bmi < 30) 
		{
            category = "Overweight";
        } 
		else 
		{
            category = "Obese";
        }

        System.out.println("Your BMI is: " + bmi); // print BMI and Category
		
        System.out.println("Category: " + category);

        sc.close();
    }
}
