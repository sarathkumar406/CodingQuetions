class SetOfCharacters 
{
	public static void main(String[] args) 
	{
		String str1 = "sarat";
		String str2 = "taras";
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int[] res = new int[256];
		boolean res1 = true;
		for(int i=0;i<str1.length();i++)
		{
			res[ch1[i]-'a']++;
			res[ch2[i]-'a']--;
		}

		for(int i=0;i<res.length;i++)
		{
			if(res[i]!=0)
			{
				res1 = false;
			}
		}

		if(res1)
		{
			System.out.println("Two strings are same set of characters");
		}
		else
		{
			System.out.println("Two strings are not same set of characters");
		}
	}
}
