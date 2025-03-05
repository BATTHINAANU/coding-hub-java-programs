class While2
{
	public static void main(String args[])
	{
		int start=1,end=10;
		int table=91,product=0;
		while(start<=end)
		{
			product=table*start;
			System.out.println(table+"X"+start+"="+product);
			start++;	
		}
	}
}