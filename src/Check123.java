class Check123 
{
	int age;
	static int id;
	Check123(int age, int id)
	{
		this.age = age;
		this.id = id;
	}
	public static void main(String[] args) 
	{
		Check123 c = new Check123(12,23);
		Check123 c1 = new Check123(20,43);
		System.out.println(c.age);
		System.out.println(c1.age);
		System.out.println(c.id);
		System.out.println(c1.id);

	}
}
