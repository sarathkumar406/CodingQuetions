class FourSum 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 5, 1, 0, 6, 0};
		int x = 8;
		int sum  = 0;
		for(int i =0;i<4;i++)
		{
			sum+=arr[i];
			if(sum == x){
				System.out.println(true);
				break;
			}
		}
		if(sum!=x){
			for(int i=4;i<arr.length;i++)
			{
				sum+=arr[i];
				sum-=arr[i-4];
				if(sum == x){
					System.out.println(true);
					break;
				}
			}
		}
	}
}
