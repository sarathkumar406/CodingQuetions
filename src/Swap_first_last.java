class Swap_first_last 
{
	public static void main(String[] args) 
	{
		int n = 1234;
		swap(n);
	}
	private static void swap(int n)
	{
		int num = n;
		int digits = 0;
		while(num>0)
		{
			num/=10;
			digits++;
		}
		int firstDigit = n/(int)Math.pow(10,digits-1);
		int lastDigit = n%10;

		System.out.println("firstDigit __________ "+firstDigit);
		System.out.println("lastDigit __________ "+lastDigit);

		n = (n%(int)Math.pow(10,digits-1))+(lastDigit*(int)Math.pow(10,digits-1));
		System.out.println(n);
		n=n/10;//removing the last Digit
		n = n*10+firstDigit;//add the firstDigit
		System.out.println(n);
		
	}
}
