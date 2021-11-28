import java.util.*;
class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n/2;
		int flag = 1;
		for(int i =2;i<=m;i++)
		{
			if(n%i==0)
			{
				flag = 0;
				break;
			}
		}
			if(flag ==1)
				System.out.println(n+" is a prime");
			else
				System.out.println(n+" is a not prime");

	}
}
