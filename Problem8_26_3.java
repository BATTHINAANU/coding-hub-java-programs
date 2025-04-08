import java.util.Scanner;
class Problem8_26_3
{
	public static void main(String args[])
	{
		//Find the average of all the elements of the array

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int a[]=new int[sc.nextInt()];

		System.out.println("Enter the a[] elements");

		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}

		Problem8_26_3 p1=new Problem8_26_3();
		
		int sum=p1.sum(a);
		System.out.println("Sum of array elements are : "+sum);

		double average=p1.average(sum,a);
		System.out.println("average of array elements are : "+average);	
		
	}
	int sum(int a[])
	{
		int sum=0;
		for(int x=0;x<a.length;x++)
		{
			sum+=a[x];
		}
		return sum;
	}
	double average(int sum,int a[])
	{
		return sum/a.length;
	}
}