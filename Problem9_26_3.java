import java.util.Scanner;
class Problem9_26_3
{
	public static void main(String args[])
	{//search for the element in the array
	//Linear search
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int a[]=new int[sc.nextInt()];

		System.out.println("Enter the a[] elements");

		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		
		Problem9_26_3 p1=new Problem9_26_3();
		p1.printArray(a);

		System.out.println("Enter the number for searching");
		int search=sc.nextInt();

		boolean found=p1.foundOrNot(a,search);

		if(found==true)
		{
			System.out.println("Element is found");
		}
		else 
			System.out.println("Element not found");
	}
	boolean foundOrNot(int a[],int search)
	{
		boolean found=false;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==search)
			{
				found=true;
				break;
			}
		}
		return found;
	}
	void printArray(int a[])
	{
		System.out.println("The elements of the array are ");
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
	}
}