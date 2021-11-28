//5. Write a method to remove duplicate values from an array list passed as an input parameter.
import java.util.*;
class RemoveDuplicates
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,4,5,6));
		System.out.println(list);
		list = removeDuplicates(list);
		System.out.println(list);
	}
	private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){

		if(list.size() > 0)
		{
			Set<Integer> set = new HashSet<>(list);
			list = new ArrayList<>(set);
		}
		return list;
	}
}
