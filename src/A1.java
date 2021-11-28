import java.util.*;
class A1
{
	public static void main(String[] args)
	{
		int[] arr = {10,50,20,-30,15,18,2};
		int sum = 20;
		calculateSumValues(arr,sum);
	}
	private static void calculateSumValues(int[] arr, int sum)
	{

		for(int i =0;i<arr.length;i++)
		{
			int curr_sum =0;
			for (int j = i; j < arr.length; j++)
            {
				curr_sum+=arr[j];

				if(curr_sum == sum)
				{
					printArray(arr,i,j);
				}
			
			}
		}
	}

	private static void printArray(int[] arr, int start, int end)
	{
		for(int i =start;i<end;i++)
		{
			System.out.print(arr[start]+" ");
		}
	}

}
