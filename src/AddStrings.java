class AddStrings 
{
	public static void main(String[] args) 
	{
		String str = "9";
		String str1 = "9";

		//int a = str.charAt(2) - '0';
		int n = str.length();
		int n1 = str1.length();
		int carry  = 0;
		int sum  = 0;
		StringBuilder sb = new StringBuilder();
		while(n > 0 || n1 > 0)
		{
			int s1 = (n!=0)?str.charAt(n-1) - '0' : 0;
			int s2 = (n1!=0)?str1.charAt(n1-1) - '0' : 0;
			sum = carry + s1 + s2;
			carry = sum / 10;
			sum = sum % 10;
			sb.append(sum);
			if(n!=0)
			{
				n--;
			}
			if(n1!=0){
				n1--;
			}
		}
		if(carry!=0)
		{
			sb.append(carry);
		}
		System.out.println(sum);
		System.out.println(sb.reverse().toString());
	}
}
