import java.util.Scanner;
import java.util.Random;
class Problem4_26_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the size of the array");
		Random r=new Random();
		int a[]=new int[5];
		int b[]=new int[6];
		int c[]=new int[a.length+b.length];
		System.out.println("a[] array elements are");
		for(int x=0;x<a.length;x++)
			a[x]=r.nextInt(10,100);
		for(int x=0;x<a.length;x++)
			System.out.println(a[x]);
		System.out.println("b[] array elements are");
		for(int x=0;x<b.length;x++)
			b[x]=r.nextInt(100,200);
		for(int x=0;x<b.length;x++)
			System.out.println(b[x]);
		int y=0;
		for(int x=0;x<c.length;x++)
		{
			if(x<a.length)
			{
				c[x]=a[x];
			}
			else
			{
				c[x]=b[y];
				y++;
			}
		}
		System.out.println("c[] array elements are ");
		for(int x=0;x<c.length;x++)
		{
			System.out.println(c[x]);
		}
	}
}
