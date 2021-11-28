class A
{
	int a = 100;
	public void m1()
	{
		System.out.println("A m1()");
	}
}

class B extends A
{
	int a = 200;

	public void m1()
	{
		System.out.println("B m1()");
	}
}

class Common 
{
	public static void main(String[] args) 
	{
		B a = new B();
		System.out.println(a.a);
		a.m1();
	}
}
