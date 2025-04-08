class Max_of_2D_array
{
	public static void main(String args[])
	{
		int max=Integer.MIN_VALUE;
		int a[][]=new int[][]{{1,2,3,4},{5,6,7,8,9,10},{11,12,13,14,15,16,17},{1}};
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				if(a[r][c]>max)
				{
					max=a[r][c];
				}
			}
		}
		System.out.println("Maximum element in a 2D array is "+max);
	}
}