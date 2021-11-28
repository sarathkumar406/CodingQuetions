import java.util.*;
class MoveAllZeros 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,1,0,8,7,0,5,2,0,0};
		int n = arr.length;

		if(n==0 || n==1)
		{
			System.out.println(0);
			
		}
		int temp;
		int right = 0,left =0;
		while(right < n)
		{
			if(arr[right] ==0)
			{
				right++;
			}
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
}
