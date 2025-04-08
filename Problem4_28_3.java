class Problem4_28_3
{
	public static void main(String args[])
	{
		//
		int a[]={10,100,20,30},temp=0;
		for(int x=0,y=a.length-1;x<a.length/2;x++,y--)
		{
			temp=a[x];
			a[x]=a[y];
			a[y]=temp;
		}
		for(int x=0;x<a.length;x++)
			System.out.println(a[x]);
	}
}