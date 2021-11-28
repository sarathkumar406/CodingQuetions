import java.util.*;
class GenerateParanthesis1 
{
	public static void main(String[] args) 
	{
		int n = 3;
		ArrayList<String> res = new ArrayList<>();
		generateParanthesis(res,"",0,0,n);
		System.out.println(res);
	}
	private static void generateParanthesis(ArrayList<String> res,String s, int open, int close,int n)
	{
		if(s.length()==2*n)
		{
			res.add(s);
			return;
		}
		
		if(open < n)
		{
			generateParanthesis(res,s+"(",open+1,close,n);
		}
		if(close < open)
		{
			generateParanthesis(res,s+")",open,close+1,n);
		}

	}
}
