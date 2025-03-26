class Problem7_13_3
{
	public static void main(String args[])
	{
		int num=12;
		while(num!=0)
		{
			int fact=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			System.out.println(rem+" factorial is "+fact);
			num/=10;
		}
	}
}