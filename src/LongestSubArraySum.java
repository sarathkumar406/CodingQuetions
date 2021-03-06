class LongestSubArraySum 
{
	public static void main(String[] args) 
	{
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = arr.length;
		longestSubArraySum(arr,n);
	}

	private static void longestSubArraySum(int[] arr, int n)
	{
		int max_so_far = Integer.MIN_VALUE;
		int max_end_here = 0;
		int start = 0, s =0, end =0;

		for(int i=0;i<n;i++)
		{
			max_end_here += arr[i];
			if(max_so_far < max_end_here)
			{
				max_so_far = max_end_here;
				start = s;
				end = i;
			}
			if(max_end_here < 0)
			{
				max_end_here =0;
				s=s+1;
			}
		}

		System.out.println("max Sum : "+max_so_far);
		System.out.println("Start Index : "+start +"  end index : "+end);
	}
}
