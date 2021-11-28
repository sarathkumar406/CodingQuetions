class A
{
	public static void m1()
	{
		System.out.println("A m1");
	}
	public void m2()
	{
		System.out.println("A m2");
	}
}
class B extends A
{
	public static void m1()
	{
		System.out.println("B m1");
	}
	public void m2()
	{
		System.out.println("B m2");
	}
}
class StaticCheck 
{
	public static void main(String[] args) 
	{
		A a = null;
		a.m1();
		//String str = new String(null); error: reference to String is ambiguous
		//System.out.println(str);

		Integer i = null;
	//	int j = i; // NullPointerException
		String str = String.valueOf(i);
		System.out.println(str);

	}
}
