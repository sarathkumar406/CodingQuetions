class SmallestPossitive 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 1, 0, -1, -2};
		int n = arr.length;
		int currPos;
		for(int i =0;i<n;i++)
		{
			currPos = arr[i]-1;
			while(arr[i] >= 1 && arr[i] <= n && arr[i] != arr[currPos])
			{
				int temp = arr[i];
				arr[i] = arr[currPos];
				arr[currPos] = temp;
				currPos = arr[i]-1;
			}
		}

		for(int i =0;i<n;i++)
		{
			if(arr[i] != i+1)
			{
				System.out.println(i+1);
				break;
			}
		}
		
		//System.out.println(n+1);
	}
}
