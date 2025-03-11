class Tricky1_10_3
{
	public static void main(String args[])
	{
		int num=111,rem=0,sum=0,count=0,temp=num,division=0,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			sum+=rem;
			count++;
			num/=10;	
		}
		
			System.out.println(rev+" after reverse ");
			System.out.println("count is "+count);
			System.out.println("Sum is "+sum);
		while(rev!=0)
		{
			rem=rev%10;
			division=sum/rem;
			System.out.print(division);
			rev/=10;
		}
	}
}