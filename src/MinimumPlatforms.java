class MinimumPlatforms 
{
	public static void main(String[] args) 
	{
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 }; 
		int dep[] = { 910, 1050, 1120, 1130, 1900, 2000 };
		//int n = 6;
		int n = arr.length;
	/*	int platform = 1,res = 1;
		int n=6;
		int i=1,j=0;
		for( i =0;i<n;i++)
		{
			platform = 1;
			for( j = i+1; j<n;j++)
			{
				if((arr[i] >= arr[j] && arr[i] <= dep[j]) || (arr[j] >= arr[i] && arr[j] <=dep[i]))
					platform++;
			}
			res = Math.max(res,platform);
		}
		*/
		int plat_needed = 1, result = 1;
        int i = 1, j = 0;
 
        // run a nested  loop to find overlap
        for (i = 0; i < n; i++) {
            // minimum platform
            plat_needed = 1;
 
            for (j = i + 1; j < n; j++) {
                // check for overlap
                if ((arr[i] >= arr[j] && arr[i] <= dep[j])
                    || (arr[j] >= arr[i]
                        && arr[j] <= dep[i]))
                    plat_needed++;
            }
 
            // update result
            result = Math.max(result, plat_needed);
		}	
		System.out.println(result);

	}
}
