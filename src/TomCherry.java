import java.util.*;
class TomCherry 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i =0;i<n;i++)
		{
			String str1 = sc.next();
			String str2 = sc.next();
			List<Character> l1 = convertStringToCharList(str1);
			List<Character> l2 = convertStringToCharList(str2);
			String res = findFriends(l1,l2);
			System.out.println(res);
		}
	}

	private static String findFriends(List<Character> str1, List<Character> str2)
	{
		if(str2.size() > str1.size())
			return "NO";
		String s = "";
		for(int i =0;i<str2.size();i++)
		{
			if(str1.contains(str2.get(i)))
			{
				
			}
		}
		System.out.println("str1 ----------->>> "+str1);
		System.out.println("s ----------->>> "+s);
		System.out.println("str2 ----------->>> "+str2);
		if(str1.equals(str2))
			return "YES";
		else
			return "NO";
	}

	 public static List<Character>
    convertStringToCharList(String str)
    {
  
        // Create an empty List of character
        List<Character> chars = new ArrayList<>();
  
        // For each character in the String
        // add it to the List
        for (char ch : str.toCharArray()) {
  
            chars.add(ch);
        }
  
        // return the List
        return chars;
    }
  
}
