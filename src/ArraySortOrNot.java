class ArraySortOrNot 
{
	public static void main(String[] args) 
	{
		//int[] arr = {1,10,3,4,5};
		int[] arr = {5,4,3,2,1};

		boolean res = sort(arr);
		if(res)
		{
			System.out.println("sorted");
		}
		else
		{
			System.out.println("Not Sorted");
		}
	}

	private static boolean sort(int[] arr)
	{
		int n = arr.length;

		if(n==0 || n==1)
			return true;

		for(int i =1;i<n;i++)
		{
			if(arr[i-1] < arr[i])
				return false;
		}
		return true;
	}

}
