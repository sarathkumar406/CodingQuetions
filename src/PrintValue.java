class PrintValue 
{
	public static void main(String[] args) 
	{
		print();
	}
	static int i = 10;
	private static void print()
	{
		if(i>0)
		{
			System.out.println("hello");
			i--;
			print();
		}
	}
}
