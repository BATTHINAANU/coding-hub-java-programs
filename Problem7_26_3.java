import java.util.Scanner;
class Problem7_26_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={10,23,24,25,78,79};
		int b[]=new int[a.length];
		int y=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				b[y]=a[x];
				y++;
			}
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2!=0)
			{
				b[y]=a[x];
				y++;
			}
		}
		System.out.println("Elements of b[] are");
		for(int x=0;x<b.length;x++)
		{
			System.out.println(b[x]);
		}
	}
}