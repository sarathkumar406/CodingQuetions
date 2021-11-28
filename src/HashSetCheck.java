import java.util.*;
class HashSetCheck 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<>();
		Integer s1 = new Integer(123);
		//String s2 = new String("Sarat");
		Integer s2 = s1;
		hs.add(s1);
		hs.add(s2);
		System.out.println(hs.size());
	}
}
