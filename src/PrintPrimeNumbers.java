class PrintPrimeNumbers 
{
	public static void main(String[] args) 
	{
		int i ,j,flag;

		for(i=1;i<=10;i++)
		{
			if(i==0 || i==1)
				continue;

			flag = 1;

			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag =0;
					break;
				}
			}

			if(flag==1)
				System.out.print(i+" ");
		}
	}
}
