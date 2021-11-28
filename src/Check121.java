class Check121 
{
	static int a = 20;
	Check121(int a)
	{
		this.a = a;
	}
	public static void main(String[] args) 
	{
		//a = 30;
		Check121 c = new Check121(40);
		Check121 c1 = new Check121(50);
		//System.out.println(a);
		System.out.println(c.a);
		System.out.println(c1.a);
	}
}
