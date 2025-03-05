class Fizz_Buzz
{
	public static void main(String args[])
	{
		int start=1,end=15;
		while(start<=end)
		{//1<=15 t 2<=15
			//int num=start;
			if(start%3==0&&start%5==0)  //1%3==0 f
			{
				System.out.println(start+"  Fizz Buzz");
			}
			else if(start%3==0)     //1%3==0 f
			{
				System.out.println(start+"  Fizz");
			}
			else if(start%5==0)    //1%5==0 f
			{
				System.out.println(start+"  Buzz");
			}
			else    
			{
				System.out.println(start);    //1
			}
			start++;  //2
		}
	}
}