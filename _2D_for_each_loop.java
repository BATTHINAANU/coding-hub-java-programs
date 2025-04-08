import java.util.Scanner;
class _2D_for_each_loop
{
	public static void main(String args[])
	{
		_2D_for_each_loop obj=new _2D_for_each_loop();
		int a[][]=new int[5][3];
		int b[][]=obj.print_elements(a,a.length,a[0].length);
		
		for(int t[]:b)
		{
			for(int t2:t)
			{
				System.out.print(t2+" ");
			}
			System.out.println("");
		}
	}
	int[][] print_elements(int a[][],int rows,int columns)
	{
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<rows;r++)
		{
			for(int c=0;c<columns;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		return a;
	}
}
