import java.util.*;
class PairsOfSum 
{
	public static void main(String[] args) 
	{
		int arr[] = {3, 5, 10, 15, 17, 12, 9};
		int k = 4;
		int n = arr.length;
		int maxSum = 0;
		Arrays.sort(arr);

		for(int i = n-1;i>0;i--)
		{
			if(arr[i]-arr[i-1] < k)
			{
				maxSum += arr[i];
				maxSum += arr[i-1];
				i--;
			}
		}
		System.out.println(maxSum);
	}
}
