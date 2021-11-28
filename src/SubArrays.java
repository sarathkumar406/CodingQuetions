class SubArrays 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3};
		int k = 3;
		int n = arr.length;
		subArraySum(arr,n,k);
	}
	private static void subArraySum(int[] arr, int n, int k)
	{
		int count = 0;
		int sum = 0;
		for(int i =0;i<n;i++)
		{
			sum+=arr[i];
			if(sum == k)
			{
				count++;
				sum = sum - arr[n-i-1];
			}
			System.out.println("sum "+sum);
		}
		System.out.println("count of subarrays : "+count);
	}
}
