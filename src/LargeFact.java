import java.util.*;
class LargeFact 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int s = 0;
		int res = factorial(n, s);
		System.out.println(res);

		int[] arr = {2,3,6,7};
		int N = arr.length;
		int left = arr[N/2];
		int right = arr[N-1];

		double median = (left + right)/2;
		
		System.out.println(median);
	}
	private static int factorial(int n, int res)
	{	
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return res = n* factorial(n-1, res);
		}
	}
}
