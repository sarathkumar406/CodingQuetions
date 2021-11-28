import java.util.*;
import java.io.*;
class A 
{
	public void m1() throws Exception
	{
		System.out.println("A");
	}
}
class B extends A
{
	public void m1()
	{
		System.out.println("B");
	}
}
class Maina 
{
	public static void main(String[] args) 
	{
		A b = new B();
		try
		{
			b.m1();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
