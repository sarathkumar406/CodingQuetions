class MultityNumbers 
{
	public static void main(String[] args) 
	{
		int res = multiply(4,5);
		System.out.println(res);
	}

	private static int multiply(int a, int b)
	{
		if(b==0)
			return 0;

		if(b > 0)
		{
			return (a + multiply(a,b-1));
		}
		if(b < 0)
		{
			return -multiply(a,-b);
		}
		return -1;
	}
}
