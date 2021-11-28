class ReplaceCheck 
{
	public static void main(String[] args) 
	{
		String str = "connectors<br/>connetions";

		str = str.replace("<br/>"," ");
		System.out.println("after replace "+str);
	}
}
