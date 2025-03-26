import java.util.Scanner;
class Problem1_26_3
{
	public static void main(String args[])
	{
		//Sum of array elements
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter Array elements");
		for(int x=0;x<=arr.length-1;x++)
		{
			arr[x]=sc.nextInt();
			sum+=arr[x];
		}
		System.out.println("Array elements are :");
		for(int x=0;x<arr.length;x++)
			System.out.println(arr[x]);
		System.out.println("Sum of elements of the array is "+sum);
	}
}