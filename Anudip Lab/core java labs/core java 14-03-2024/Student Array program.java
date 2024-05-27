//3. create a class student and implement array list and display details of student


class Student
{
	
	int age; //variables of class student
	String name;
	
	Student(int age, String name) //parameterized consnstructor
	{
		this.age=age;
		this.name=name;
	}
	
	public static void main(String args[]) //main method
	{
		
		Student[]arr=new Student[5]; //created object of array of size 5
		
		arr[0]=new Student(20, "sara");
		arr[1]=new Student(32, "Alia");
		arr[2]=new Student(38, "Shraddha");
		arr[3]=new Student(34, "Ananya");
		arr[4]=new Student(30, "janvi");
		
		for(int i=0;i<arr.length;i++) //printing array objects using for loop
		{
			System.out.println(" Age: " + arr[i].age + " Name: " + arr[i].name );
		}
	}
	
}
