import java.util.Scanner;
class Problem2_26_3
{
	public static void main(String args[])
	{
		//Print even array elements
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a[]=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("The even array elements are");
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				System.out.println(a[x]);
			}
		}
	}
}

