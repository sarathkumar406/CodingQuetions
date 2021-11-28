class AA
{
	void m1()
	{
		System.out.println("AA m1");
	}
}
class BB extends AA
{
	void m1()
	{
		System.out.println("BB m2");
	}
}
class MainAA 
{
	public static void main(String[] args) 
	{
		AA a = new BB();
		BB b = new BB();
		AA aa = new AA();
		b.m1();
		a.m1();
	}
}
