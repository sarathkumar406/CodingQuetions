import java.util.*;
class MergeArrays 
{
	public static void main(String[] args) 
	{
		int[] arr = {3,4,6};
		int[] arr1 = {2,5};
		int[] res = new int[arr.length + arr1.length];
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			res[count++] = arr[i];
		}
		for(int i=0;i<arr1.length;i++)
		{
			res[count++] = arr1[i];
		}
		
		Arrays.sort(res);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}

	}
}


/*

head = [1,2,3,4,5], left = 2, right = 4




*/