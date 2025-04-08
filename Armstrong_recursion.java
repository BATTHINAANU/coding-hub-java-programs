class Armstrong_recursion
{
	public static void main(String args[])
	{
		Armstrong_recursion arm=new Armstrong_recursion();
		int num=153;
		int count1=arm.count(num,0);
		System.out.println(count1);
		int sum1=arm.sum(num,0,count1);
		System.out.println("Sum is "+sum1);
		if(num==sum1)
			System.out.println(num+" ARMSTRONG NUMBER");
		else 
			System.out.println(num+" IS NOT AN ARMSTRONG NUMBER");
		
	}
	int count(int num,int count1)
	{
		if(num!=0)
		{
			return count(num/10,++count1);
		}
			return count1;
	}
	int power(int num,int count1)
	{
		if(count1==0)
		{
			return 1;
		}
		      return num*power(num,--count1); 
	}
	int sum(int num,int sum1,int count1)
	{
		if(num!=0)
		{
			int rem=num%10;
			sum1+=power(rem,count1);
			return sum(num/10,sum1,count1);
		}
		return sum1;
	}

}