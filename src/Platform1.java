class Platform1 
{
	public static void main(String[] args) 
	{
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int n  = arr.length;

		int[] res = new int[2361];
		int resPlatform = 1;
		for(int i =0;i<n;i++)
		{
			++res[arr[i]];
			--res[dep[i]+1];
		}

		for(int i =1;i<2361;i++)
		{
			res[i] = res[i]+res[i-1];
			resPlatform = Math.max(resPlatform,res[i]);
		}

		System.out.println(resPlatform);


	}
}
