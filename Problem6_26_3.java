import java.util.Scanner;
class Problem6_26_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40,50,60,70,80,90,100};
		int b[]=new int[a.length];
		System.out.println("Elements of a[] is ");
		for(int x=0;x<a.length;x++)
			System.out.println(a[x]);
		for(int x=a.length-1,y=0;x>=0;x--,y++)
		{
			b[y]=a[x];
		}
		System.out.println("Elements of b[] is ");
		for(int x=0;x<a.length;x++)
			System.out.println(b[x]);
	}
}