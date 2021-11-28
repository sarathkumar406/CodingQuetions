import java.util.*;
class CyclicRotate 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		rotate(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotate(int[] arr)
	{
		int i = 0, j = arr.length -1;

		while(i!=j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
