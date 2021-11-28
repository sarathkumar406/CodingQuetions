class RotateImage 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2},
			{3,4}};

		int n = arr.length;
		System.out.println(n);

		for(int i =0;i<n;i++)
		{
			for(int j=i;j<n-i-1;j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[n-1-j][i];
				arr[n-1-j][i] = arr[n-1-i][n-1-j];
				arr[n-1-i][n-1-j] = arr[j][n-1-i];
				arr[j][n-1-i] = temp;
			}
		}
	
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" " );

			}
			System.out.println();
		}


	}
}
