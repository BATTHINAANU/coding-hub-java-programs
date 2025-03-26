class Problem6_13_3
{
	public static void main(String args[])
	{
		int num=12345;
		while(num!=0)
		{
			int rem=num%10;
			for(int i=1;i<=10;i++)
			{
				int pro=rem*i;
				System.out.println(rem+"X"+i+"="+pro);
			}
			num/=10;
		}
	}
}