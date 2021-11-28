class SubArraySum 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,4,20,3,10,5};
		int k = 33;
		int curr_sum = 0;
		int j = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(curr_sum == k){
				System.out.println(j+" "+i);
				return;
			}
			curr_sum+=arr[i];
			
			while(curr_sum > k)
			{
				curr_sum -=arr[j];
				j++;
			}
		}

	}
}
