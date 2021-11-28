class NullCheck 
{
	public static void main(String[] args) 
	{
		check(null);
	}

	private static void check(Object obj)
	{
		System.out.println("Object Obj");
	}
	private static void check(String obj)
	{
		System.out.println("String Obj");
	}
}
