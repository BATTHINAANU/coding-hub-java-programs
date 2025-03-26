import java.util.Scanner;
class Problem8_26_3
{
	public static void main(String args[])
	{
		//Find the average of all the elements of the array
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
			sum+=a[x];
		}
		int average=sum/a.length;
		System.out.println("Average of all elements of the array is "+average);
	}
}