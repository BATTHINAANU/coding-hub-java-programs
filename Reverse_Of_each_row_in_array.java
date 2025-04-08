import java.util.Scanner;
class Reverse_Of_each_row_in_array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][4];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=sc.nextInt();
			}	
		}
		for(int r=0;r<a.length;r++)
		{
			for(int c=a[r].length-1;c>=0;c--)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}
}

