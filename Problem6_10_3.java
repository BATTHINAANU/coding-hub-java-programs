class Problem6_10_3
{
	public static void main(String args[])
	{
		int num=1200,temp=num,count=0,quo=0,rev_rev=0,temp_rev=0,rev=0,rem=0,count1=0,power=0;
		System.out.println(num+" is the number we have taken");
		while(num!=0)
		{
			rem=num%10;
			count++;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev+" is the first reverse");
		while(rev!=0)
		{
			rem=rev%10;
			count1++;
			rev_rev=rev_rev*10+rem;
			rev/=10;	
		}
		System.out.println(rev_rev+" is the reverse of 1st reverse");
		temp_rev=rev_rev;
		if(temp==rev_rev)
		{
			System.out.println(temp+" , "+rev_rev+" are same ");
		}
		else
		{
			count=count-count1;
			power=(int)Math.pow(10,count);
			System.out.println(temp_rev*power+" is the number we taken...");
		}
	}
}