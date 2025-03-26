import java.util.Scanner;
class Problem12_26_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the size of the array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the elements of the array a[]");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				count++;
			}
		}
		System.out.println("Count is "+count);
		int b[]=new int[count];
		for(int x=0,y=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				b[y]=a[x];
				y++;
			}
		}
		System.out.println("The elements in the array b[] are");
		for(int x=0;x<count;x++)
		{
			System.out.println(b[x]);
		}
	}
}