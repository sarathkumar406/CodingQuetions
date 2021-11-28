import java.util.*;
class KthlargestElement 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,1,5,7,9};
		int k = 2;

		PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

		for(int i =0;i<arr.length;i++)
		{
			minHeap.add(arr[i]);
			if(minHeap.size() > k)
			{
				minHeap.poll();
			}
		}

		System.out.println(minHeap.peek());

	}
}
