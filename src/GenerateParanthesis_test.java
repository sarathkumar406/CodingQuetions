import java.util.*;
class GenerateParanthesis_test 
{
	public static void main(String[] args) 
	{
		int n = 4;
		ArrayList<String>  res = new ArrayList<>();
		backTrack(res,"",0,0,n);
		System.out.println(res);
	}
	private static void backTrack(ArrayList<String> res, String s, int open, int close, int n)
	{
		if(s.length()==2*n)
		{
			res.add(s);
			return;
		}

		if(open < n)
		{
			backTrack(res,s+"(",open+1,close,n);
		}

		if(close < open)
		{
			backTrack(res,s+")",open,close+1,n);
		}

	}
}

