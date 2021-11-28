class PatternPrint 
{
	public static void main(String[] args) 
	{
		int n = 3;
		for(int i=0;i<n;i++)
		{
			for(int j =0;j<2*n-2*i-1;j++)
			{
				if(i%2==0)
				{
					//System.out.println("ii");
					if(j%2==0)
					{
						//System.out.println("jj");
						System.out.print("*");
					}
					else
					{
						System.out.print("@");
					}
				}
				else
				{
					if(j%2==0)
					{
						System.out.print("@");
					}
					else
					{
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
