class Practice7_6_3
{
	public static void main(String args[])
	{
		int num=9;
		int start=2,end=num,min=0;
		while(end>=start)
		{
			if(num%end==0)
			{
				System.out.println(end);
				min=end;
			}
			end--;
		}
		System.out.println("Least factor: "+min);	
	}
}