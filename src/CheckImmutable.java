class CheckImmutable 
{
	public static void main(String[] args) 
	{
		CheckImmutable c = new CheckImmutable();
		String str= "hello";
			System.out.println(str.toString());
	 str = "how are you";
			System.out.println(str.toString());
		
	}
	public String toString()
	{
		System.out.println(getClass().getName()+"@"+Integer.toHexString(hashCode()));
		  return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
}
