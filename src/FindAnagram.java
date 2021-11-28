//4. Write a method to check whether the strings passed as input parameters are made up of the same set of characters.
class FindAnagram
{
	public static void main(String[] args) 
	{
		String str1 = "lirii";
		String str2 = "liril";
		boolean res = Anagram(str1,str2);
		System.out.println(res);
	}

	private static boolean Anagram(String str1, String str2)
	{
		int no_of_chars = 256;
		int[] arr = new int[no_of_chars];
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		if(ch1.length!=ch2.length)
			return false;

		for(int i =0;i<ch1.length;i++)
		{
			arr[ch1[i]-'a']++;
			arr[ch2[i]-'a']--;
		}
		
		for(int i =0;i<no_of_chars;i++)
		{
			if(arr[i]!=0)
			{
				return false;
			}
		}
		return true;
	}
}
