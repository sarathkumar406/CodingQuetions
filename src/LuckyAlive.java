import java.util.*;
class  LuckyAlive
{
	public static void main(String[] args) 
	{
		int n = 5;
		int[] arr = new int[n];
		int count = 1;
		for(int i =0;i<n;i++)
		{
			arr[i] = count++;
		}

		for (int i =0;i<arr.length;i+=2)
		{
			System.out.print(arr[i]+" ");
		}
		int[] res = new int[arr.length];
		int temp = 0;
		int j =0;
		while( temp < res.length && res.length != 1)
		{
			res[j++] = arr[temp];
			
			if(temp==res.length-1)
			{
				temp = 0;
			}
			else
			{
				temp+=2;
			}
		}
		//System.out.println(Arrays.toString(arr));

	}
}


/*
N = 5;

1 2 3 4 5
0 1 2 3 4
-> 1 3 5 -> 3 

right  = 0;
if(right == len)
	right =-2;
0 2 4 == arr[0] arr[1] arr[2]

21298 -- reg this bug, could you please check in your mananger whether it is simulating or not
Could you please check once whether working fine or not in your manager please
*/