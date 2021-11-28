//2. Write a method to return the maximum value from an integer array passed as an input parameter.
class FindMaximumNumber
{
	public static void main(String[] args) 
	{
		int[] arr = {-11,-5,-3,-1};
		int max = findMaximuNumber(arr);
		System.out.println(max);
	}

	private static int findMaximuNumber(int[] arr){
		
		int max = Integer.MIN_VALUE;
		
		if(arr.length > 0)
		{
			for(int a : arr)
			{
				max = Math.max(a,max);
			}
			return max;
		}
		return -1;

	}
}
