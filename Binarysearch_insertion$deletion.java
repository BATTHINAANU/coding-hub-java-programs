import java.util.Scanner;
class Binarysearch_insertion$deletion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int x=0;x<=a.length-2;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		System.out.println("Array after sorting");
		for(int temp:a)
		{
			System.out.println(temp);
		}





		System.out.println("Enter the element to be search");
		int search=sc.nextInt();
		int first=0,last=a.length-1,mid=0;
		while(first<=last)
		{
			mid=(first+last)/2;
			if(a[mid]==search)
			{
				System.out.println("Search element found");
				break;
			}
			else if(search>a[mid])
				first=mid+1;
			else
				last=mid-1;		
		}
		if(first>last)
		{
			System.out.println("Here element not found so insert the element");
			System.out.println("Enter the index where you need to insert");
			int i=sc.nextInt();
			if(i<a.length)
			{
				for(int x=a.length-1;x>i;x--)//Element not found so need to insert the element in a particular index//Right shift
				{
					a[x]=a[x-1];
				}
				a[i]=search;
				System.out.println("Array after insertion");
			}
			else
			{
				System.out.println("Invalid index");
			}
		}
		else
		{
			System.out.println("As array element found you need to delete that element from the array");
			for(int x=mid;x<=a.length-2;x++)//Element found so need to delete that element //Left shift
			{
				a[x]=a[x+1];
			}
			a[a.length-1]=0;
			System.out.println("Array after deletion");
			for(int temp:a)
				System.out.println(temp);
		}
	}
}