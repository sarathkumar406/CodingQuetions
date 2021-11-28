//7. Write a method to reverse an integer array passed as an input parameter.
class ReverseArray
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int[] res = reverse(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}
	private static int[] reverse(int[] arr){
		int[] res = new int[arr.length];int count =0;
		if(arr.length > 0)
		{
			for(int i = arr.length-1;i>=0;i--)
			{
				res[count++] = arr[i];
			}
		}
		return res;
	}
}
