class Practice3_6_3 
{//factors
	public static void main(String args[])
	{
		int num=100;
		int start=1,end=num,sum=0,count=0;
		System.out.println("the factors of "+num+"are");
		while(start<=end)
		{
			if(num%start==0)
			{
				System.out.println(start);
				sum+=start;
				count++;
			}
			start++;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Count is "+count);
		
	}
}