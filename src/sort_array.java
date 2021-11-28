class sort_array 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,1,9,4,3};

		insertionSort(arr);

	}
	private static void insertionSort(int[] arr)
	{
		int n = arr.length;

		for(int i = 1;i<n;++i)
		{
			int key = arr[i];
			int j = i-1;
			while(j >=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	

		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
