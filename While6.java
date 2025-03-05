class While6
{
	public static void main(String args[])
	{
		int start=1,end=10;
		while(start<=end)
		{
			if(start%2==0)
				System.out.println(start+" is even");
			else
				System.out.println(start+" is odd");
			start++;
		}	
	}
}