/*
class Equals_Not_Arrays
{
	public static void main(String args[])
	{
		int a[]={10,20,30};
		int b[]={10,30,20};
		if(a.length==b.length)
		{
			int count=0;
			for(int x=0;x<a.length;x++)
			{
				count=0;
				if(a[x]!=b[x])
				{
					count=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not equal");
			}
		}
		else
		{
			System.out.println("Not equal");
		}
	}
}
*/

class Equals_Not_Arrays
{
	public static void main(String args[])
	{
		int a[]={10,20,10};
		int b[]={10,20,0};
		if(a.length==b.length)
		{
			int count=0;
			for(int x=0;x<a.length;x++)
			{
			   count=0;
			   for(int temp:b)
			   {
				if(a[x]==temp)
				{
					count++;
					break;
				}
			    }
			    if(count==0)
			    {
				System.out.println("Not equal");
			    }
			}
			if(count!=0)
			{
				System.out.println("EQUAL");
			}
		}
	}
}