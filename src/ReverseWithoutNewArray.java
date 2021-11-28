class ReverseWithoutNewArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		arr = reverse(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	private static int[] reverse(int[] arr)
	{
		int temp;
		int middle = arr.length/2;
		int j = arr.length;
		for(int i =0;i<middle;i++)
		{
			temp = arr[i];
			arr[i] = arr[j-i-1];
			arr[j-i-1] = temp;
		}
		return arr;
	}
}
