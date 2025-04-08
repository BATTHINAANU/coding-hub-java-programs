class Transpose
{
	public static void main(String args[])
	{
		int a[][]=new int[][]{{1,2},{4,5}};
		int b[][]=new int[a.length][a[0].length];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				if(r==c)
				{
					b[r][c]=a[r][c];
				}
				else
				{
					b[r][c]=a[c][r];
				}
			}
		}
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(b[r][c]+" ");
			}
			System.out.println();
		}
	}
}