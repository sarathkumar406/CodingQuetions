class Factorial 
{
	public static void main(String[] args) 
	{
		int n = 6;
		int res = fact(n);
		System.out.println(res);
	}

	private static int fact(int n)
	{
		//recurssion
	/*	if(n>0)
			return n * fact(n-1);
		else
			return 1;
	*/
	int sum=1;
	//using for loop
		for(int i =1;i<=n;i++)
		{
			sum*=i;
		}
		return sum;
	}
}
