import java.util.*;
class ReverseAnArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void reverseArray(int[] arr)
	{
		int n = arr.length;
		
			for (int i = 0; i < n / 2; i++){
				int temp = arr[i];
				arr[i] = arr[n-i-1];
				arr[n-i-1] = temp;
				//j--;
			}
		
	}
}
