class SecondLargest 
{
	public static void main(String[] args) 
	{
		int[] arr = {10,20,30,40,50,100};
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		if(arr.length < 2)
		{
			System.out.println(-1);
		}
		else
		{
			for(int i =0;i<arr.length;i++)
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
		System.out.println(second);
	}
}
