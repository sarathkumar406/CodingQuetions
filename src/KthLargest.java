import java.util.*;
class KthLargest 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,3,4,59,21};
		int k = 3;

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for(int i=0;i<arr.length;i++)
		{
			queue.add(arr[i]);
			if(queue.size()>k)
			{
				queue.poll();
			}

		}
		System.out.println(queue.peek());
	}
}
