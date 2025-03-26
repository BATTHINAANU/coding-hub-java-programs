/*
class Evil
{
	public static void main(String args[])
	{
		int num=1,sum=0;
		int square=num*num;
		System.out.println("SQUARE IS "+square);
		while(square!=0)
		{
			int rem=square%10;
			sum=sum+rem;
			square/=10;
		}
		System.out.println("SUM IS "+sum);
		if(num==sum)
			System.out.println("EVIL NUMBER");

	}
}

*/

class Evil
{
	int num;
	int square(int num)
	{
		int square=num*num;
		return square;
	}
	int calSum(int square)
	{
	   int sum=0;
	   while(square>0)
	   {
		int rem=square%10;
		sum=sum+rem;
		square/=10;
	   }
	   return sum;
	}
	void checkEvil(int sum)
	{
		if(num==sum)
			System.out.println("EVIL NUMBER");
		else
			System.out.println("NOT EVIL NUMBER");
	}
	public static void main(String args[])
	{
		Evil e=new Evil();
		e.num=45;
	        int square=e.square(e.num);
		int sum=e.calSum(square);
		e.checkEvil(sum);
	}
}