class Check1 
{
	static void m1()
	{
		System.out.println("static method");
	}
	public static void main(String[] args) 
	{
		Check1 c = null;
		c.m1();

		String str = new String("sarat");
		String str1 = new String("sarat");
		if(str == str1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		int[] arr = {1, 2, 3, 4, 2, 5, 1};

		for(int i =0;i<arr.length;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
