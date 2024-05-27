//create a program in java to implement multilevel inheritance and hierarchical inheritance.
//Take classes like : Doctor, Surgeon and Nurse
//create methods and show method overriding


class Doctor // parent class Doctor
{
    void display() 
	{
        System.out.println("I am a parent class named Doctor");
    }
	void Duty()
	{
		System.out.println("I work along with surgeon and nurse");
	}
}

class Surgeon extends Doctor // child class Surgeon 

{
    void display() // Method overriding i.e.same method as in parent class
	{
        System.out.println("I am a first child class named Surgeon");
    }
	void Duty()
	
	{
		System.out.println("I work day and night");
	}

}


class Nurse extends Doctor // child class Nurse which also contain same properties as parent class Doctor
{
    
    void display() // Method overriding i.e.same method as in parent class
	{
        System.out.println("I am a second child class named Nurse");
    }
	void Duty()
	{
		System.out.println("I also work at day and night but majorly at night");
	}
}

public class Hospital 
{
    public static void main(String[] args) 
	{
        Doctor d = new Doctor(); 
		
        d.display(); // Calls overridden method in doctor class
		d.Duty();
		System.out.println(".......................................");
		
		Surgeon s = new Surgeon(); 
		
        s.display(); // Calls overridden method in Surgeon class
		s.Duty();
		System.out.println(".......................................");
		
		Nurse n = new Nurse(); 
		
        n.display(); // Calls overridden method in Nurse class
		n.Duty();
    }
}
