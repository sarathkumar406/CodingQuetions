class  Check
{
	public static void main(String[] args) 
	{
		String str = "a_MIN";
		//String str1 = str.length() > 1?str+"_MIN":"MIN";
		String str1 = str.substring(0,str.lastIndexOf("_"));
		String str2 = str.substring(str.lastIndexOf("_")+1);
		System.out.println(str1.length());
		System.out.println(str2);
	}
}
