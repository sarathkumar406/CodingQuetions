class  ValidIp
{
	public static void main(String[] args) 
	{
		
		
		String str = "172.16.254.1";

		String[] arr = str.split(".");
		boolean flag = true;
		int r = 0;
		for(int i=0;i<arr.length;i++)// 16 // 254 //1
		{
			
			char[] ch = arr[i].toCharArray(); // 1 7 2// 1 6  //2 5 4 //1
			for(int j =0;j<ch.length;j++)//1 7 2 // 1 6 //2 5 4 //1
			{
				if(!Character.isDigit(ch[j]))
				{
						flag = false;
				}
			}
			if(flag){
					r = Integer.parseInt(arr[i]);//172 //16 //254 //1

				if(r > 0 && r < 255)//
				{
					flag = true;
				}
				
			}
			
		}

		System.out.println(flag);
	}
}

/*

validate an ip address
Input: IP = "172.16.254.1"
*/

Reverse a linked list
1->3->4->7
7->4->3->1


Node reverse(Node head)
{
	Node curr = head;// 1
	Node prev  = null;
	Node next = null;
	while(curr!=null)
	{
		next = curr.next; //3//4 //7 
		curr.next = prev;// null // 1// 3
		prev = curr;// 1 // 3 // 4
		curr = next;// 3//4//7
	}
	head = prev;
	return head;
}


Check if two strings are anagram
str1 = "anagram"
str2 = "nagaram"


Map<Character,Integer> hm1 = new HashMap<>();
for(int i =0;i<str1.length();i++)
{
	if(hm1.containsKey(str1.charAt(i)))
	{
		hm1.put(str1.charAt(i), hm.get(str1.charAt(i))+1);
	}
	else
	{
		hm1.put(str1.charAt(i),1);
	}
}

for(int i =0;i<str2.length();i++)
{
	if(hm1.containsKey(str2.charAt(i)))
	{
		hm1.put(str1.charAt(i), hm.get(str1.charAt(i))-1);
	}
}
boolean flag = true;
for(Map.Entry<Character,Integer> entry : hm1.entrySet())
{
	if(entry.getValue() != 0)
	{
		flag = false;
		break;
	}
}
return flag;
