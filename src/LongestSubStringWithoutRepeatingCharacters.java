import java.util.*;
class LongestSubStringWithoutRepeatingCharacters 
{
	public static void main(String[] args) 
	{
		String str = "GeeksforGeeks";

		HashMap<Character,Integer> visited = new HashMap<>();
		int start = 0;
		int max_length = 0;

		for (int end =0;end<str.length();end++ )
		{
			if(visited.containsKey(str.charAt(end)))
			{
				start = Math.max(end,visited.get(str.charAt(end))+1);
			}
			visited.put(str.charAt(end),end);
			max_length = Math.max(max_length,end-start+1);
		}
		System.out.println("max_length "+max_length);
	}
}
