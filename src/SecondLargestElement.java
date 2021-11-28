//6. Write a method to return the second largest element in an integer array passed as an input parameter.
class SecondLargestElement
{
	public static void main(String[] args) 
	{
		int[] arr = {1000,999,3,4,5};
		int res = secondLargest(arr);
		System.out.println(res);
	}
	private static int secondLargest(int[] arr){
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		if(arr.length < 2)
		{
			return -1;
		}
		else
		{
			for(int i = 0;i<arr.length;i++)
			{
				if(arr[i] > first)
				{
					second = first;
					first = arr[i];
				}

				if(second < arr[i] && first!=arr[i])
				{
					second = arr[i];
				}
			}
		}
		return second;
	}
}
