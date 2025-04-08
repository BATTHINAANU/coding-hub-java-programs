class Sum_of_2_arrays
{
	public static void main(String args[])
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int temp[][]=new int[a.length][a[0].length];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				temp[r][c]=a[r][c]+b[r][c];
			}
		}
		for(int r=0;r<temp.length;r++)
		{
			for(int c=0;c<temp[r].length;c++)
			{
				System.out.print(temp[r][c]+" ");
			}
			System.out.println();
		}
	}
}