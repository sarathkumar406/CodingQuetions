import java.util.*;
class SampleCheck 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add('c');
		al.add('e');
		al.add('d');
		System.out.println(al);
		//int n = indexOf('e');
		al.remove(al.indexOf('e'));
		System.out.println(al);

	}
}