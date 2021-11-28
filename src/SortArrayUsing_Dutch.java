class SortArrayUsing_Dutch 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,0,1,0,1,0,1,0,0,2,0,2};
		int low =0,mid =0;
		int high = arr.length-1;
		int temp;
		while(mid <= high)
		{
			switch(arr[mid]){
				case 0:
				{
					temp = arr[low];
					arr[low] = arr[mid];
					arr[mid] = temp;
					low++;
					mid++;
					break;
				}
				case 1:
				{
					mid++;
					break;
				}
				case 2:
				{
					temp = arr[mid];
					arr[mid] = arr[high];
					arr[high] = temp;
					high--;
					break;
				}
			}
		}

		for(int a : arr)
		{
			System.out.print(a+" ");
		}
	}
}
