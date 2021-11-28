import java.util.*;
class Islands 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++)
		{
			ArrayList<String> al = new ArrayList<>();
			String str1 = sc.next();
			al = findAllPosibilities(str1,"",al);
			Collections.sort(al);
			System.out.println(al);
		}
	}

	private static ArrayList<String> findAllPosibilities(String str, String res, ArrayList<String> al)
	{
		if(str.length() == 0)
		{
			//System.out.print(res+" ");
			//System.out.println();
			al.add(res);

		}

		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			String ros  = str.substring(0,i) + str.substring(i+1);

			findAllPosibilities(ros,res+ch, al);
		}
		return al;
		
	}
}
