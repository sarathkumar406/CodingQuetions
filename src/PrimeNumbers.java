class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		int n =10;
		int count = 0;
		boolean flag = false;
		for(int i =2;i<=n;i++)
		{
			
			flag = false;
			for(int j =1;j<=i;j++){
				if(i%j==0){
					flag = true;
					break;
				}
			}

			if(flag)
				System.out.println(i);

			//count =0;
		}
		

	}
}
