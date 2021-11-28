import java.util.*;
import java.util.*;
class Max_Element 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,2,0,9,6,3,0,1};

		int right =0,left =0;
		 int n = arr.length;
		int temp;
		 while(right < arr.length)
		{
			if(arr[right] == 0)
			{
				++right;
			}
			else
			{
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				++right;
				++left;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
/*

Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00} 
dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00} 
 
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



*/