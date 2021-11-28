//8. Write a method to return the odd numbers and their frequency from an integer array list passed 
//as an input parameter.
import java.util.*;
class CountOfOddNumbers 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(1,2,3,4,5,5));
		HashMap<Integer,Integer> res = countOddNumbers(list);
		for(Map.Entry<Integer,Integer> entry : res.entrySet())
		{
			System.out.println(entry.getKey() +" - "+entry.getValue());
		}
	}

	private static HashMap<Integer,Integer> countOddNumbers(ArrayList<Integer> list)
	{
		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i =0;i<list.size();i++)
		{
			if(list.get(i)%2!=0)
			{
				if(hm.containsKey(list.get(i)))
				{
					hm.put(list.get(i),hm.get(list.get(i))+1);
				}
				else
				{
					hm.put(list.get(i),1);
				}
			}
		}
		return hm;
	}
}
