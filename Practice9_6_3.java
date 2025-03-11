class Practice9_6_3
{
	public static void main(String args[])
	{
		int a=2,b=3,count=1;
		int c=0;
		int n=10;
		System.out.print(a+" "+b);   //fibonacci series
		while(count<n-1)   
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			count++;	
		}
	}
}