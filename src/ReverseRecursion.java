class ReverseRecursion 
{
	public static void main(String[] args) 
	{
		String str = "kumar";
		StringBuilder sb = new StringBuilder();
		
		int length = str.length();
		str = reverse(str,sb,length);
		System.out.println("reversed String _______ "+str);
	}
	private static String reverse(String str,StringBuilder sb,int length)
	{
		if(length > 0){
			sb.append(str.charAt(length-1));
			length--;
			reverse(str,sb,length);
		}

		return sb.toString();

	}

}
