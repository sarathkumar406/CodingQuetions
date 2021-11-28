class SortArray1 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,0,1,0,1,0,1,0};
		//sort {0,0,0,0,1,1,1,1}
		int zerosCount = 0, onesCount = 0,twosCount = 0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] == 0)
				zerosCount++;
			else if(arr[i] ==1)
				onesCount++;
			else
				twosCount++;
		}
		System.out.println(zerosCount);
		System.out.println(onesCount);
		int j;
		int count = 0;
		for(j =0;j<zerosCount;j++)
		{
			arr[count++] = 0;
		}
		for(j=0;j<onesCount;j++)
		{
			arr[count++] = 1;
		}

		for(int a : arr)
		{
			System.out.print(a+" ");
		}

	}
}
