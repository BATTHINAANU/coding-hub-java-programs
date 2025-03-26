class Problem7_24_3
{
	public static void main(String args[])
	{
		Power p=new Power();
		p.num=12;
		p.sum_product(p.num);
		p.checkPowerNumber();
	}
}
class Power
{
	int num,sum,product;
	void sum_product(int num)
	{
		product=1;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num/=10;			
		}
	}
	void checkPowerNumber()
	{
			System.out.println("Sum "+sum+"Product"+product);
			if(sum==product)
			System.out.println("POWER NUMBER");
	}
	
}