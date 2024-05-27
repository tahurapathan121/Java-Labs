package com.collectionFramework;
import java.util.Vector;

class Details
{
    private String name;
    private int age;
    private String grade;

    public Details(String name, int age, String grade) 
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public String getGrade() 
    {
        return grade;
    }

    public String toString() 
    {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

public class Student1 
{
    public static void main(String[] args) 
    {
        Vector<Details> students = new Vector<>();

        // Adding student details
        students.add(new Details("Arya", 20, "A"));
        students.add(new Details("Seema", 25, "B"));
        students.add(new Details("Jay", 17, "C"));

        // Printing student details
        System.out.println("Student Details:");
        for (Details student : students) 
        {
            System.out.println(student);
        }
    }
}
