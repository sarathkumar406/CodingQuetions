
import java.util.Deque;
import java.util.LinkedList;
class GenerateParanthesis_Using_Deque_test 
{
	public static void main(String[] args) 
	{
		int n = 2;
		Deque<String> deque = new LinkedList<>();
		deque = generateParanthesis(n);
		System.out.println(deque);
	}

	private static Deque<String> generateParanthesis(int n)
	{
		Deque<String> deque = new LinkedList<>();
		deque.add("");
		while(deque.peek().length()!= 2*n)
		{
			String s = deque.pop();
			if(s.isEmpty()){
				deque.add("()");
			}
			else
			{
				for(int i =0;i<s.length();i++)
				{
					if(s.charAt(i)=='(')
					{
						String t = s.substring(0,i+1)+ "()" +s.substring(i+1);
						if(!deque.contains(t)){
							deque.add(t);
						}
					}
				}
				deque.add(s+"()");
			}
		}
		return deque;
	}
}
