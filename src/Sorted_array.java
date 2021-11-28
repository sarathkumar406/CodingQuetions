class Sorted_array
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		boolean res = true;
		for(int i =0;i<arr.length;i++)
		{
			for(int k=0;k<arr.length;k++);
			{
				if(arr[k]!= arr[i]+i+1)
				{
					res = false;
					break;
				}
			}
		}
		if(res)
		{
			System.out.println("Sorted");
		}
		else
		{
			System.out.println("Not Sorted");
		}
	}
}


