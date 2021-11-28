class Fibanocci 
{
	public static void main(String[] args) 
	{
		int a =0,b = 1;
		int n = 10;
		//System.out.print(a+" "+b+" "); 
		for(int i=1;i<n-1;i++)
		{
			int c = a+b;
			a = b;
			b = c;
		}
		System.out.println(b);

	}
}
