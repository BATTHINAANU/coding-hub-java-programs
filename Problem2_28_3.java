class Problem2_28_3
{
	public static void main(String args[])
	{
		//i/p:--{10,20,30,40,50}     o/p:--{50,10,20,30,40}    
		int a[]={10,20,30,40,50};
		int temp=a[a.length-1];
		for(int x=a.length-1;x>0;x--)
		{
			a[x]=a[x-1];			
		}
		a[0]=temp;
		System.out.println("Elements of the array are ");
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}		
	}
}