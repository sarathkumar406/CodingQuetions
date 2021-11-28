import java.util.*;
class PairSocks
{
	public static void main(String[] args) 
	{
		/*int[] arr = {10,20,10,30,10,20,10};

		Map<Integer,Integer> hm = new HashMap<>();
		for(int i =0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i],1);
			}
		}

		//10 -- 4
		//20 -- 2
		//30 -- 1
		for(Map.Entry<Integer,Integer> entry : hm.entrySet())
		{
			int pair = entry.getValue()/2;
			int single = entry.getValue()%2;
			System.out.println(entry.getKey() +" Having pairs of "+pair);
			System.out.println(entry.getKey() +" Having "+single);
		}
*/
String s = "payp##al";
		int left = 0, right = s.length()-1;
char[] str = s.toCharArray();
while(left < right)
{
	if(str[left]=='#')
	{
		left++;
	}
	else if(str[right]=='#')
	{
		right--;
	}
	else
	{
		char temp = str[left];
		str[left] = str[right];
		str[right] = temp;
		left++;
		right--;
	}

}
String st = new String(str);
System.out.println(st);
String str1 = "AA";
findIndex(str1);
	}

	private static void findIndex(String st)
	{
		int res = 0;
		for(int  i =0;i<st.length();i++)
		{
			res*=26;//0//26
			res+=st.charAt(i) - 'A'+1;//1//27
		}
		System.out.println(res);

		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1==s2);

	}
}

/*You will be provided with the array of size of socks..
you need to find out how many pairs are there and how many individual socks are there
ex:
IP:
{10,20,10,30,10,20,10}

OP:
10- 2 pair
20 - 1 pair
30- individual			   */


/*REVERSE THE GIVEN STRING, WITHOUT REVERSING THE SYMBOLS/SPECIAL_CHARACTERS.
eX:
Ip: payp##al
op: lapy##ap

ip: abcde##fg
op: gfedc##ba*/



