import java.util.Scanner;
class Insert_Element
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size+1];
		System.out.println("Enter the array elements");
		for(int x=0;x<a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("The array elements before insertion are");
		for(int temp:a)	
			System.out.println(temp);
		System.out.println("Enter number to be inserted");
		int k=sc.nextInt();
		System.out.println("Enter the index where we are inserted");
		
		int i=sc.nextInt();
	   if(i<a.length-1 && i>=0)
	   {
		for(int x=a.length-1;x>i;x--)
		{
			a[x]=a[x-1];
		}
		a[i]=k;
		System.out.println("Array after insertion");
		for(int temp:a)	
			System.out.println(temp);
	   }
	   else
		System.out.println("Unable to insert");
	}
}