class TCS_11_3
{
	public static void main(String args[])
	{
		int n=6;
		int arr[]={2, 4, 7, 9, 6, 5};
		System.out.println(n);
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}	
}