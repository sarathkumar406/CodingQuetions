class aaa
{
	// int a;
	public void m1(int a, String str)
	{
		System.out.println("m1 first");
	}

	public void m1(String a, int str)
	{
		System.out.println("m1 second");
	}
}
class ccccc extends aaa
{
	 // int a;
	
	public static void main(String[] args) 
	{
		aaa  a = new aaa();
		a.m1("ss",12);
	}
}
