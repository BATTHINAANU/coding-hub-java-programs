class _2D_array_strings
{
	public static void main(String args[])
	{
		String s="hi this is anu Batthina ";
		int rows=6;
		int columns=4;
		int index=0;
		char ch[][]=new char[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(index<s.length())
				{
					ch[i][j]=s.charAt(index);
					index++;
				}
				else
				{
					ch[i][j]=' ';
				}
			}
		}
		System.out.println("Elements of the 2D array are");
		for(char t[]:ch)
		{
			for(char t1:t)
			{
				System.out.print(t1+" ");
			}
			System.out.println();
		}
	}
}