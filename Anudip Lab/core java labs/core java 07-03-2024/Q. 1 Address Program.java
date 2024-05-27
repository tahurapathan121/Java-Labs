//Define a class Address representing an address with attributes such as street, city, state and zip code. 
//Provide constructors to initialize these attributes (parameterized and no argument constructor)

class Address 
{
    String street;
    String city;
    String state;
    String zipCode;

    public Address(String street, String city, String state, String zipCode)     // Parameterized constructor

	{
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    Address()     // No-argument constructor

	{
        this.street = "Indira Nagar";
        this.city = "Bangalore";
        this.state = "Karnataka";
        this.zipCode = "560001";
        System.out.println("No-argument constructor is called");
    }

    
    public void setStreet(String street) // Set methods
	{
        this.street = street;
    }

    public void setCity(String city) 
	{
        this.city = city;
    }

    public void setState(String state) 
	{
        this.state = state;
    }

    public void setZipCode(String zipCode) 
	{
        this.zipCode = zipCode;
    }

    
    public String getStreet()  // Get methods
	{
        return street;
    }

    public String getCity() 
	{
        return city;
    }

    public String getState() 
	{
        return state;
    }

    public String getZipCode() 
	{
        return zipCode;
    }
}

public class AddressDemo 
{
    public static void main(String[] args) 
	{
        Address a = new Address("Ruby Street", "Solapur", "Maharashtra", "413003"); // Creating object of class Address

        System.out.println("Street: " + a.getStreet()); // Printing the details of the address
        System.out.println("City: " + a.getCity());
        System.out.println("State: " + a.getState());
        System.out.println("Zip Code: " + a.getZipCode());
		
		System.out.println("...................................................................");

		
		Address b= new Address("Indira Nagar", "Bangalore", "Karnataka", "560001");
		
		System.out.println("Street: " + b.getStreet()); // Printing the details of the address
        System.out.println("City: " + b.getCity());
        System.out.println("State: " + b.getState());
        System.out.println("Zip Code: " + b.getZipCode());
		
    }
}
