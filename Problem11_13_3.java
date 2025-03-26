class Problem11_13_3
{
	public static void main(String args[])
	{
		int num=6,sum=0,pro=1;
		for(int start=1;start<=num/2;start++)
		{
			if(num%start==0)
			{
				sum+=start;
				pro=pro*start;
			}
		}
		System.out.println("sum is "+sum+" product is "+pro);
		if(sum==pro)
		{
			System.out.println(num+" is a perfect number");
		}
		else
		{
			System.out.println(num+" is a not perfect number");
		}
	}
}
