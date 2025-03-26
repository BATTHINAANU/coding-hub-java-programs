class Problem5_13_3
{
	public static void main(String args[])
	{
		for(int x=1;x<=1000;x++)
		{
		int num=x,rev=0,temp=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is palindrome");
		}
		}
	}
}