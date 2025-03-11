class Problem2_10_3
{
	public static void main(String args[])
	{
		int num=13100,rem=0,rev=0,rev1=0,temp=num,rem2=0,sum=0,product=1,count=0,power=0,count1=0,count2=0;
		while(num!=0)
		{
			rem=num%10;
			count1++;
			rev=rev*10+rem;
			num/=10;	
		}
		System.out.println("After 1st reverse "+rev);
		count=(int)(count1/2);
		//System.out.println("count is "+count);
		num=temp;
		count2=count;
		while(num!=0&&count!=0)
		{	power=(int)Math.pow(10,count);
			rem=rev%10;
			rem2=num%10;
			product=rem*rem2;
			rev/=10;
			num/=10;	
			sum=sum+product;
			count--;
			
		}
		num=temp;
		System.out.println(sum);
		count1=count1-count2;
		System.out.println("count1 is "+count1);
		if(count1>2)
			{
				num/=100;
				num=num%10;
				sum=sum+num;
			}
		System.out.println("The final result is : "+sum);
	}
}
	