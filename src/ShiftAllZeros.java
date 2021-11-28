import java.util.*;
class ShiftAllZeros 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,1,0,2,0,3,0,0,0};
		final int a;
		a = 10;
		//a = 20;
		System.out.println(a);
		int[] nums = {3,2,2,3}; int val = 3;
		removeElements(nums,val);
		shiftAllZeros(arr);
		shiftElements(arr);
		int[] newarr = new int[arr.length];
		
		int count = 0;

		for(int n : arr)
		{
			if(n!=0){
				newarr[count++]=n;
			}
		}

		System.out.println(Arrays.toString(newarr));
	}

	private static void shiftAllZeros(int[] arr)
	{

		int i =0,j=0;
		while(j<arr.length)
		{
			while(i<arr.length && arr[i]!=0)
				i++;
			if(i==arr.length)
				break;
			
			j = i+1;
			while(j<arr.length && arr[j] == 0)
				j++;
			if(j==arr.length)
				break;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}

		System.out.println(Arrays.toString(arr));
	}

	private static void shiftElements(int[] arr)
	{
		int right =0,left =0;
		int temp;
		int n = arr.length;

		while(right < n)
		{
			if(arr[right] == 0)
				++right;
			else
			{
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				++left;
				++right;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
	private static void removeElements(int[] arr, int val)
	{
//		int[] nums = {3,2,2,3}; int val = 3;
		int n = arr.length;
		int right = 0, left = 0;
		int temp;
		while(right < n)
		{
			if(arr[right] == val)
				++right;
			else
			{
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				++left;
				++right;
			}
		}
		System.out.println("sdad"+Arrays.toString(arr));

	}
}



