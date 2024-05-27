//Create a class named Employee with attributes name, employeeId, designation, and salary. Include a method calculateBonus() that returns 5% of the salary as bonus.
class Employee 
{
    String name;
    int ID;
    String designation;
    double salary;

    public Employee(String name, int ID, String designation, double salary) // parameterized Constructor
	{
        this.name = name;
        this.ID = ID;
        this.designation = designation;
        this.salary = salary;
    }

    
    double calculateBonus() // Method to calculate bonus
	{
        return 0.05 * salary; // 5% of the salary
    }

    // Get methods
    String getName() 
	{
        return name;
    }

    int getID() 
	{
        return ID;
    }

    String getDesignation() 
	{
        return designation;
    }

    double getSalary() 
	{
        return salary;
    }

    // Set methods
    void setName(String name) 
	{
        this.name = name;
    }

    void setID(int ID) 
	{
        this.ID = ID;
    }

    void setDesignation(String designation) 
	{
        this.designation = designation;
    }

    void setSalary(double salary) 
	{
        this.salary = salary;
    }
}
class EmployeeDemo
{	
	public static void main(String[] args) 
	{
       Employee e1 = new Employee("Tahura", 101, "Manager", 90000.0); // Creating an employee object

        // Printing employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + e1.getName());
        System.out.println("Employee ID: " + e1.getID());
        System.out.println("Designation: " + e1.getDesignation());
        System.out.println("Salary: " + e1.getSalary());

        
        double bonus = e1.calculateBonus(); //calculating bonus by calling the method here
        System.out.println("Bonus: " + bonus); //printing the bonus
    }
}
