//Create a class named Car with attributes make, model, year, and color. Include a method start() that prints "Car started" and a method stop() that prints "Car stopped". make a method car details to print attribues also

class Car
{
	String make="TATA";
	String model="Nexon";
	int year=2013;
	String color="Black";
	
	 void carDetails() // method without parameters 
    {
        this.make= "TATA";
		this.model="Nexon";
		this.year=2013;
		this.color="Black";
		
        System.out.println(" the make is: " + this.make + " the model is: " + this.model + " the year is: "+ this.year + " the color is: " +this.color );

    }
	
    void start(String make) ////method with 2 parameters 
    {
        
        System.out.println("The Car is started "); 
    }
	
    void stop(int year, String make, String color ) //method with three  parameters
    {
        
        System.out.println("The car is stopped");
    }
	

}
class CarDemo
{
	public static void main(String args[])
	{
		Car c=new Car();
		c.carDetails();
		c.start("TATA");
		c.stop(2013, "TATA", "Black");
	
	
	}

}
