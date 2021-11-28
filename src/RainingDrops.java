class RainingDrops 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,0,2};
		int n = arr.length;
		int left = 0;
		int right = n-1;
		int leftMax = 0;
		int rightMax = arr[n-1];
		int total = 0;
		while(left < right)
		{
			leftMax = Math.max(leftMax,arr[left]);
			rightMax = Math.max(rightMax,arr[right]);
			if(leftMax <= rightMax )
			{
				total +=leftMax - arr[left++];
			}
			else
			{
				total +=rightMax - arr[right--];
			}
		}
		System.out.println(total);
	}
}
