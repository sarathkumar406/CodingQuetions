import java.util.*;
class Odd_integers 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
 		 al = oddIntegers(10,al);
		 System.out.println(al);
	}

	private static ArrayList oddIntegers(int n, ArrayList al)
	{
		//System.out.println(n);

		if(n%2!=0)
			al.add(n);
		if(n!=0)
		{
			n--;
			oddIntegers(n,al);
		}
		return al;
	}
}
