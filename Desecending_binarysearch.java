class Desecending_binarysearch
{
	public static void main(String args[])
	{
		//Binary search on descending array 

		int a[]=new int[]{20,30,10,90,120,34,29};
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]<a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		for(int temp:a)
			System.out.println(temp);
		int search=1,f=0,l=a.length-1;
		while(f<=l)
		{
			int mid=(f+l)/2;
			if(search==a[mid])
			{
				System.out.println(search+" is found at "+mid+" location");
				break;
			}
			else if(search>a[mid])
				l=mid-1;
			else
				f=mid+1;
		}
		if(f>l)
			System.out.println(search+" is not found in the array");
	}
}