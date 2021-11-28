class sample 
{
	void run()
	{
		System.out.println("parent class");
	}
}
class Example extends sample
{
	void run()
	{
		System.out.println("Child Class");
	}
	public static void main(String[] args) 
	{
		Example s = new Example();
		s.run();
	}
}
