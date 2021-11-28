import java.util.*;
class EnumTest 
{
	enum test{sarat,kumar,sajja};
	public static void main(String[] args) 
	{
		for(test t : test.values())
		{
			System.out.print(t+" ");
		}
	}
}
