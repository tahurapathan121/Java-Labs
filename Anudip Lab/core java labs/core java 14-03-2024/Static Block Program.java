//2. write a program to demonstrate static block take two static variables name and ID and print them

class StaticExample 
{
	static int id=201; //initializing the static variables ID and Name
	
	static String sname="Tahura";
	
	static //static block
	{
		System.out.println("Hello I am static Block"); //printing in the static block so that we know this is static block
		
		System.out.println("The name is: " + sname + " The ID is: " + id); //printing the name and ID
	}
	
	public static void main(String args[]) //main method of program
	{
	}

}
