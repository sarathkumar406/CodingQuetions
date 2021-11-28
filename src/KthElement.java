import java.util.*;
class KthElement
{
	public static void main(String[] args)  // N = 3, height[] = {1, 3, 4}
	{
		int[] arr1 = {2, 3, 6, 7, 9};
		int[] arr2 = {1, 4, 8, 10};
		int k = 5;

		int[] res = new int[arr1.length + arr2.length];
		int count = 0;
		for(int i =0;i<arr1.length;i++)
		{
			res[count++] = arr1[i];
		}
		for(int i =0;i<arr2.length;i++)
		{
			res[count++] = arr2[i];
		}

		
		Arrays.sort(res);

		System.out.println(res[k-1]);
		System.out.println(Arrays.toString(res));
	}
}
