import java.util.*;
import java.io.*;
class Exam 
{
	public void m1() throws IOException
	{
		System.out.println("m1");
	}
	public void m2() throws FileNotFoundException
	{
		System.out.println("m2");
	}
	public static void main(String[] args) 
	{
		Exam e = new Exam();
		try
		{
			e.m1();
			e.m2();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		
	}
}