class Employee
{
	public void m1()
	{
		System.out.println("Employee");
	}
}

class Student extends Employee
{
	public void m1()
	{
		super.m1();
		System.out.println("Student");
	}
}

class Parent_Child
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.m1();
	}
}
