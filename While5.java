/*
class While5
{
	public static void main(String args[])
	{
		int start=1,end=10;
		while(start<=end)
		{
			double sqrt=Math.sqrt(start);
       		        if(sqrt==(int)sqrt)
			System.out.println(start+" is a perfect Square  ");
			start++;
		}			

	}
}

*/


class While5
{
	public static void main(String args[])
	{
		int start=1,end=10;
		while(start<=end)
		{
			double sqrt=Math.sqrt(start);
			if(sqrt*sqrt==start)
			System.out.println(start+" is a perfect Square  ");
			start++;
		}			

	}
}
