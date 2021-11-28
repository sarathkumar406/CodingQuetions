//1. Write a method to remove a given value from array list having string values.
import java.util.*;
class RemoveValueFromList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Chennai");
		al.add("Hyderabad");
		al.add("Bangalore");
		al.add("Mumbai");
		al.add("Delhi");
		String val = "Delhi";
		System.out.println(al);
		al = removeValue(val,al);
		System.out.println(al);
	}
	private static ArrayList<String> removeValue(String val, ArrayList<String> list){

		if(list.size()>0)
		{
			if(list.contains(val))
			{
				list.remove(val);
			}
		}
		return list;
	}
}
