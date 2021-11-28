class A
{
	void m1()
	{
		System.out.println("A m1()");
	}
}

class B extends A
{
	void m2()
	{
		System.out.println("B m2()");
	}
	void m1()
	{
		System.out.println("B m1()");
	}
	
}
class Check12 
{
	public static void main(String[] args) 
	{
		B b = null;
		//B b1 = new A();
		A a = null;
		b.m1();
		//b1.m1();
		a.m1();


		//String str = new String(null);
		//System.out.println(str);
	}
}
