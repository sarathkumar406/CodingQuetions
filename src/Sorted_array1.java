class Sorted_array1
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,2,7,5};
		//int[] arr = {5,4,3,2,1};
		int n = arr.length;
		boolean res = true;
		for(int i =1;i< n;i++)
		{
			if(arr[i-1] > arr[i]){
				res = false;
				break;
			}
		}
		if(res)
		{
			System.out.println("Sorted with ascending Order");
		}
		else
		{
			System.out.println("Not Sorted");
		}
		res = true;
		for(int i = n-1;i >1;i--)
		{
			if(arr[i] > arr[i-1]){ //2 > 1
				res = false;
				break;
			}
		}
		if(res)
		{
			System.out.println("Sorted with descending order");
		}
		else
		{
			System.out.println("Not Sorted");
		}
	}
}


