class Problem3_28_3
{
	public static void main(String args[])
	{
		//i/p:--{10,20,30,40,50}     o/p:--{20,30,40,50,10}  
		int a[]={10,20,30,40,50};
		int temp=a[0];
		for(int x=0;x<a.length-;x++)
		{
			a[x]=a[x+1];			
		}
		a[a.length-1]=temp;
		System.out.println("Elements of the array are ");
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}		
	}
}