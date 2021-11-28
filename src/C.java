class A 
{
	public void m1()
	{
		System.out.println("A m1 method");
	}
	
}

class B extends A
{
	public void m1()
	{
		System.out.println("B m1 method");
	}
	public void m1(int a)
	{
		System.out.println("B m1 method"+a);
	}

	public void m2()
	{
		System.out.println("B m2 method");
	}
}

class C 
{
	public static void main(String[] args) 
	{
		A a = new B();
		a.m1();
		a.m1(10);
		a.m2();


		//B b  = new A(); // In compatable types
		//b.m1();
		//b.m2();
	}
}
