class A
{
	int x = 20;
	public void m1()
	{
		System.out.println("A m1()");
	}
}

class B extends A
{
	int x = 30;
	public void m1()
	{
		System.out.println("B m1()");
	}
}




class NumCheck 
{
	public static void main(String[] args) 
	{
		int  n = 17;
		if((n & (n-2)) == 0)
		{
			System.out.println(true);
		}

		B b = new B();
		b.m1();
		System.out.println(b.x);

		A a = new A();
		a.m1();
		System.out.println(a.x);

		A aa = new B();
		aa.m1();
		System.out.println(aa.x);
	}
}
