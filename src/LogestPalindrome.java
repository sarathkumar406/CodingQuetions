
class LogestPalindrome 
{
	static int resLen;
	static int resStart;
	public static void main(String[] args) 
	{
		String str = "forgeeksskeegfor";
		
	String res = longestPalindrom(str);
	System.out.println(res);
		
		
	}

	public static String longestPalindrom(String str){

		int n = str.length();
		if(n < 2)
		{
			return str;
		}
		for(int start = 0;start<n-1;start++)
		{
			expandRange(str,start,start);
			expandRange(str,start,start+1);
		}
		return str.substring(resStart,resStart + resLen);
	}

	private static void expandRange(String str, int start, int end)
	{
		while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end))
		{
			start--;
			end++;
		}
		if(resLen < end -start-1)
		{
			resStart  = start+1;
			resLen = end-start-1;
		}
	}

}
