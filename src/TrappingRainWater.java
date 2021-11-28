class TrappingRainWater 
{
	public static void main(String[] args) 
	{
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

		int n = arr.length;

		int leftMax = 0, rightMax =0,res =0;
		int left = 0,right =n-1;

		while(left <=right)
		{
			if(arr[left] < arr[right])
			{
				if(arr[left] > leftMax)
				{
					leftMax = arr[left];
				}
				else
				{
					res+=leftMax - arr[left];
				}
				left++;
			}
			else
			{
				if(arr[right] > rightMax)
				{
					rightMax = arr[right];
				}
				else
				{
					res+=rightMax - arr[right];
				}
				right--;
			}

		}
		System.out.println(res);
	}

	private static void trappingWater(int[] arr)
	{
		int n = arr.length;
		int res =0;
		
		for(int i =1;i<n-1;i++)
		{
			int left = arr[i];
			for(int j = 0;j<i;j++)
			{
				left = Math.max(left,arr[j]);
			}
			int right = arr[i];

			for(int k =i+1;k<n-1;k++)
			{
				right = Math.max(right,arr[k]);
			}
			res+=Math.min(left,right)-arr[i];
		}
	}
}
