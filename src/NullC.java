class A
{
	
	public void m1(Object s){
		System.out.println("Object");
	}
	public void m1(String s){
		System.out.println("String");
	}

}
class NullC 
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1(null);
	}
}
