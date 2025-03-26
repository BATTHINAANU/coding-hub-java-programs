import java.util.Scanner;
class Problem9_26_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int a[]=new int[sc.nextInt()];
		int sum=0;
		System.out.println("Enter the a[] elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==10)
			{
				System.out.println("Element found at "+x+" index");
				break;
			}
		}
		
		
	}
}