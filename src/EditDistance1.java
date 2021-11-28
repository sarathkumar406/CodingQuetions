class EditDistance1 
{
	public static void main(String[] args) 
	{
		String s1 = "geek";
		String s2 = "gesek";
		int res = editDistance(s1,s2,s1.length(),s2.length());
		System.out.println(res);
	}
	private static int editDistance(String s1, String s2,int m, int n)
	{
		int[][] res = new int[m+1][n+1];

		for(int i =0;i<=m;i++)
		{
			for(int j =0;j<=n;j++)
			{
				if(i==0)
				{
					res[i][j] = j;
				}
				else if(j==0)
				{
					res[i][j] = i;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					res[i][j] = res[i-1][j-1];
				}
				else
				{
					res[i][j] = 1+Math.min(Math.min(res[i][j-1],res[i-1][j]),res[i-1][j-1]);
				}
			}
		}
		return res[m][n];
	}
}
