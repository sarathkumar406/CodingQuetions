class StringCheck 
{
	public static void main(String[] args) 
	{
		String a = "Hello";
		String b = new String("Hello");
		String c = "Hello";
		String d = new String("Hello");

		if(a==b)
		{
			System.out.println("a == b");
		}
		if(a == c)
		{
			System.out.println("a == c");
		}
		if(a == d)
		{
			System.out.println("a == d");
		}
		if(b == d)
		{
			System.out.println("b == d");
		}

	}
}


/*

Select salary from employee order by salary limit n-1,1;
For multiple employees have same salary
Select * from employee where Salary = (select Distinct salary from employee order by sal limit n-1,1);
Aeisha Musthafa Bhasha
Amusthafa@paypal.com
sasajja@paypal.com

*/