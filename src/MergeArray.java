import java.io.*;
import java.util.Arrays;
class MergeArray
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int[] arr1 = { -5, 3, 6, 12, 15 };
        int[] arr2 = { -12, -10, -6, -3, 4, 10 };

		int i = arr1.length;
		int j = arr2.length;
		int[] arr3 = new int[i+j];
		System.arraycopy(arr1,0,arr3,0,i);
		System.arraycopy(arr2,0,arr3,i,j);

		Arrays.sort(arr3);

		int res = median(arr3);
		System.out.println(res);
	}
	private static int median(int[] arr){
		int n = arr.length;

		if(n%2==0)
		{
			int z = n/2;
			int e = arr[z];
			int q = arr[z-1];
			int res1 = (e+q)/2;
			return res1;
		}
		else
		{
			int res = Math.round(arr[n/2]);
			return res;
		}
	}
}
