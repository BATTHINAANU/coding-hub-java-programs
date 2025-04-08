class Binary_recursion
{
	public static void main(String args[])
	{
		int a[]={10,-2,-175,5,28,34};
		/*
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]>a[x+1])
			{
				int temp=a[x];
				a[x]=a[x+1];
				a[x+1]=temp;
				x=-1;
			}
		}
		*/
		//SORTING

		Binary_recursion b=new Binary_recursion();
		b.sort(a,0);
		for(int t:a)
			System.out.println(t);

		//SEARCHING
		int search=10;
		b.binarySearch(a,0,a.length-1,search);
			
	}
void sort(int a[],int x)
{
	if(x<a.length-1)
	{
		if(a[x]>a[x+1])
		{
			int temp=a[x];
			a[x]=a[x+1];
			a[x+1]=temp;
			x=-1;
		}
		sort(a,x+1);
	}
}


void binarySearch(int a[],int first,int last,int search)
{
	int mid=(first+last)/2;
	if(first>last)
	{
		System.out.println("Element not found");
	}
	else
	{
		if(a[mid]==search)
			System.out.println("Element found at "+mid+" index");
		else if(search>a[mid])
			binarySearch(a,mid+1,last,search);
		else
			binarySearch(a,first,mid-1,search);
	}
	
}

}
