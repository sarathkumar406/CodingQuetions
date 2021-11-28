class DigitDivisor 
{
	public static void main(String[] args) 
	{
		int n = 10;
		int temp = n;
		int count = 0;
		while(temp!= 0)
		{
			int rem = temp %10;
			if(rem!=0 && n % rem == 0)
			{
				count++;
			}
			temp = temp/10;
		}
		System.out.println(count);
	}
}
