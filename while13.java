/*
class While13
{
	public static void main(String args[])
	{
		int start=1,end=10;
		while(start<=end)
		{
			System.out.print(start%2==0?start+"\n":"");     //we dont have else but we need to print it and we need to print it continuous line by line
			start++;
		}
	}
}
*/

class While13
{
	public static void main(String args[])
	{
		int start=1,end=10;
		while(start<=end)
		{
			System.out.print(start%2==0?"":start+"\n");     
			start++;
		}
	}
}
